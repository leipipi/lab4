package cn.edu.xmu.restfuldemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    //判断是否存在key
    public  boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    //从redis中获取值
    public Serializable get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    //向redis插入值
    public  boolean set(String key, Serializable value, long timeout) {
        if (timeout <= 0) {
            timeout = 60;
        }

        long min = 1;
        long max = timeout / 5;
        try {
            //增加随机数，防止雪崩
            timeout += (long) new Random().nextDouble() * (max - min);
            redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}