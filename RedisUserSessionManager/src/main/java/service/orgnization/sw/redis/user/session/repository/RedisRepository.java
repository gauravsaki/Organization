package service.orgnization.sw.redis.user.session.repository;

import service.orgnization.sw.redis.user.session.model.UserSession;

import java.util.Map;


public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllSessions();

    /**
     * Add key-value pair to Redis.
     */
    void add(UserSession userSession);

    /**
     * Delete a key-value pair in Redis.
     */
    void deleteSession(String id);
    
    /**
     * find a movie
     */
    String findSession(String id);
    
}
