
import Consumer.IConsumer;
import Injector.IMessageServiceInjector;
import Injector.RabbitMQServiceInjector;

/**
 *
 * @author anthony
 */
public class Main {

    public static void main(String[] args) {
        IMessageServiceInjector injector;
        IConsumer app;

        //Received by RabbitMQ
        injector = new RabbitMQServiceInjector();
        app = injector.getConsumer();
        app.processMessages();
    }
}
