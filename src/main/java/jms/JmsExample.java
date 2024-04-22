package jms;

import javax.jms.*;
import javax.naming.*;


/**
 * Before running this code, you need to set up a JMS provider (such as Apache ActiveMQ, Apache Artemis, or IBM MQ) and
 * configure the JNDI context with the connection factory and queue or topic. Additionally,
 * ensure that the necessary JAR files for JMS and the JMS provider are included in your project's classpath.
 */
public class JmsExample {

    // JMS connection factory and destination names
    private static final String CONNECTION_FACTORY_NAME = "ConnectionFactory";
    private static final String QUEUE_NAME = "queue/testQueue";

    public static void main(String[] args) {
        try {
            // Set up JNDI context to lookup JMS resources
            Context jndiContext = new InitialContext();
            ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup(CONNECTION_FACTORY_NAME);
            Queue queue = (Queue) jndiContext.lookup(QUEUE_NAME);

            // Create JMS connection, session, and producer
            Connection connection = connectionFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(queue);

            // Create and send a text message
            TextMessage message = session.createTextMessage("Hello, JMS!");
            producer.send(message);
            System.out.println("Sent message: " + message.getText());

            // Close JMS resources
            producer.close();
            session.close();
            connection.close();

            // Create JMS connection, session, and consumer
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageConsumer consumer = session.createConsumer(queue);

            // Start the connection to receive messages
            connection.start();

            // Receive and process messages
            Message receivedMessage = consumer.receive();
            if (receivedMessage instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) receivedMessage;
                System.out.println("Received message: " + textMessage.getText());
            }

            // Close JMS resources
            consumer.close();
            session.close();
            connection.close();

        } catch (NamingException | JMSException e) {
            e.printStackTrace();
        }
    }
}
