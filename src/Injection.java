/**
 *
 * @author anthony
 */
public class Injection {
    private IChannel _channel;

    public Injection(IChannel channel) {
        this._channel = channel;
    }

    public com.rabbitmq.client.Channel getChannel() {
        return _channel.getChannel();
    }
}
