package cn.edu.xmu.restfuldemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import cn.edu.xmu.restfuldemo.bean.Goods;
import org.springframework.data.redis.*;


@Configuration
@EnableAutoConfiguration
public class MyRedisConfig {
    @Bean
    public RedisTemplate<Object, Goods> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Goods> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);

        Jackson2JsonRedisSerializer<Goods> ser = new Jackson2JsonRedisSerializer<>(Goods.class);
        template.setDefaultSerializer(ser);
        return template;
    }
}