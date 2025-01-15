package biz.mach.active.consumer;

import biz.mach.active.dto.AuthDTO;
import biz.mach.active.dto.Post;
import biz.mach.active.payload.response.JwtResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class Consumer {

    private static final ObjectMapper objectReader = new ObjectMapper();
    private static final RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args){
        System.out.println("Start consumer");
        try(Connection connection = new ActiveMQConnectionFactory("tcp://localhost:61616").createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)){
            HttpHeaders headers = new HttpHeaders();
            headers.add("Accept", "application/json");
            headers.add("Content-Type", "application/json");
            Queue queue = session.createQueue("post");
            MessageConsumer consumer = session.createConsumer(queue);
            connection.start();
            consumer.setMessageListener(message -> {
                System.out.println("Read message");
                try {
                    if (message instanceof TextMessage textMessage && textMessage.getText() != null &&
                            !textMessage.getText().isEmpty()) {
                            Post post = objectReader.readValue(textMessage.getText(), Post.class);
                            HttpEntity<Post> entity = new HttpEntity<>(post, headers);
                            restTemplate.postForEntity("http://localhost:8080/post/save",
                                    entity, JwtResponse.class);
                        }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            Thread.sleep(Long.MAX_VALUE);
            System.out.println("Finish consumer");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
