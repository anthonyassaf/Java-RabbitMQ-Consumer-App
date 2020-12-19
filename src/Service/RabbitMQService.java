package Service;

import Helpers.ConnectionManager;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author anthony
 */
public class RabbitMQService implements IMessageService {

    DB db = ConnectionManager.getConnection();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now;

    @Override
    public void receiveMessage(String message) {
        System.out.println(" [x] Received '" + message + "'");
    }

    @Override
    public void logMessage(String host, String queue, String message) {
        DBCollection collection = db.getCollection("log");
        now = LocalDateTime.now();
        DBObject document = new BasicDBObject();
        document.put("date", dtf.format(now));
        document.put("host", host);
        document.put("queue_name", queue);
        document.put("message_text", message);

        WriteResult writeResult = collection.insert(document);
    }

}
