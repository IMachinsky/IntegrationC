package biz.mach.active.produce;

import biz.mach.active.service.CatalogListen;
import jakarta.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer {

    public static void main(String[] args){
        System.out.println("Start producer");
        try(Connection connection = new ActiveMQConnectionFactory("tcp://localhost:61616").createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE)){
            Queue queue = session.createQueue("direction");
            MessageProducer producer = session.createProducer(queue);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            CatalogListen.listenCatalog("F:\\Magitratura\\Integration\\active\\json_send", producer, session);
            System.out.println("Finish producer");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
