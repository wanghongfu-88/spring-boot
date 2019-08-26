package com.walliam.common.redis;

import org.springframework.cache.Cache;
import org.springframework.data.redis.core.RedisOperations;

/**
 * @author yindy
 * @title: VocRedisCacheManager
 * @projectName yto-voc-server
 * @description: TODO
 * @date 2019/6/613:36 Voc spring Redis 配置
 */
public class RedisCacheManager extends org.springframework.data.redis.cache.RedisCacheManager {


    public RedisCacheManager(RedisOperations redisOperations) {
        super(redisOperations);
    }

    @Override
    public Cache getCache(String name) {
        String[] cacheParams = name.split("@");
        String cacheName = cacheParams[0];
        Long expirationSecondTime = this.computeExpiration(cacheName);
        if(cacheParams.length > 1) {
            expirationSecondTime = Long.parseLong(cacheParams[1]);
            this.setDefaultExpiration(expirationSecondTime);
        }
        Cache cache = super.getCache(cacheName);
        return cache;
    }
}
