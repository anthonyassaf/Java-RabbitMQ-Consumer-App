package Injector;

import Consumer.Consumer;
import Consumer.IConsumer;
import Service.RabbitMQService;


/**
 * @author anthony
 */
public class RabbitMQServiceInjector implements IMessageServiceInjector {

    @Override
    public IConsumer getConsumer() {
        return new Consumer(new RabbitMQService());
    }

}
