package Service;

/**
 * @author anthony
 */
public interface IMessageService {

    void receiveMessage(String message);

    void logMessage(String host, String queue, String message);
}
