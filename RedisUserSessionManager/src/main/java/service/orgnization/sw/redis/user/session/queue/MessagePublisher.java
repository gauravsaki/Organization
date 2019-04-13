package service.orgnization.sw.redis.user.session.queue;

public interface MessagePublisher {

    void publish(final String message);
}
