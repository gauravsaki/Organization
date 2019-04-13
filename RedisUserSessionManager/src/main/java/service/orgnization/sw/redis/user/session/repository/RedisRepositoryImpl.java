package service.orgnization.sw.redis.user.session.repository;

import service.orgnization.sw.redis.user.session.model.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;



import java.util.Map;
import javax.annotation.PostConstruct;

@Repository
public class RedisRepositoryImpl implements RedisRepository {
    private static final String KEY = "UserSession";
    
    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;
    private StringBuilder refreshedTokenDateTime = new StringBuilder();
    
    @Autowired
    public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }
    
    public void add(final UserSession userSession) {
        refreshedTokenDateTime.append(userSession.getRefreshToken()).append(":")
                .append(userSession.getTokenGeneratedDateTime());
        hashOperations.put(KEY, userSession.getToken(), refreshedTokenDateTime.toString());
    }

    public void deleteSession(final String id) {
        hashOperations.delete(KEY, id);
    }
    
    public String findSession(final String id){
        return  (String)hashOperations.get(KEY, id);
    }
    
    public Map<Object, Object> findAllSessions(){
        return hashOperations.entries(KEY);
    }

  
}
