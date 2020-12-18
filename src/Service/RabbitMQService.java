package Service;

/**
 * @author anthony
 */
public class RabbitMQService implements IMessageService {

    @Override
    public void receiveMessage(String message) {
        System.out.println(" [x] Received '" + message + "'");
    }
}
