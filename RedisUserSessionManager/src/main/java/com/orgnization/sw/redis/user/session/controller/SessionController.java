package com.orgnization.sw.redis.user.session.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.orgnization.sw.redis.user.session.model.UserSession;
import com.orgnization.sw.redis.user.session.repository.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class SessionController {
    
    @Autowired
    private RedisRepository redisRepository;


    @RequestMapping("/keys")
    public @ResponseBody Map<Object, Object> keys() {
        return redisRepository.findAllSessions();
    }

    @RequestMapping("/values")
    public @ResponseBody Map<String, String> findAll() {
        Map<Object, Object> aa = redisRepository.findAllSessions();
        Map<String, String> map = new HashMap<String, String>();
        for(Map.Entry<Object, Object> entry : aa.entrySet()){
            String key = (String) entry.getKey();
            map.put(key, aa.get(key).toString());
        }
        return map;
    }

    @RequestMapping(value = "/addSession", method = RequestMethod.POST)
    public ResponseEntity<String> add(
        @RequestBody UserSession session ) {

        session.setTokenGeneratedDateTime(Calendar.getInstance().toString());
        
        redisRepository.add(session);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getSession", method = RequestMethod.POST)
    public ResponseEntity<String> getSession(@RequestParam String token) {
        redisRepository.findSession(token);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteSession", method = RequestMethod.POST)
    public ResponseEntity<String> delete(@RequestParam String token) {
        redisRepository.deleteSession(token);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
