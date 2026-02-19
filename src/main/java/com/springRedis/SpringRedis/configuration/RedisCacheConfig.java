package com.springRedis.SpringRedis.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class RedisCacheConfig {

    public RedisCacheManager redisCacheManager(RedisConnectionFactory redisConnectionFactory)
    {

    }
}
