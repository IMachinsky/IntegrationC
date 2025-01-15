package biz.mach.active.service;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageProducer;
import jakarta.jms.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CatalogListen {

    public static void listenCatalog(String catalogPath, MessageProducer producer, Session session)throws Exception{
        System.out.println("Catalog listen started");
        WatchService watchService
                = FileSystems.getDefault().newWatchService();
        Path path = Paths.get(catalogPath);
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE);
        WatchKey key;
        while((key = watchService.take()) != null){
            key.pollEvents().stream()
                    .filter(event -> !event.context().toString().contains("json")&&
                            (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY))
                    .forEach(event -> {
                        File[] files = new File(catalogPath + File.separator + event.context().toString()).listFiles();
                        Arrays.stream(files)
                                .forEach(file -> {
                                    try (InputStream is = new FileInputStream(file)){
                                        String json = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                                        Message message = session.createTextMessage(json);
                                        producer.send(message);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                });
                    });
        }
        System.out.println("Catalog listen ended");
    }
}
