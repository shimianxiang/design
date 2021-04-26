package com.smx.cache;

import com.smx.cache.adapter.FileCacheAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * redis 缓存
 */
public class Cache extends CacheHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cache.class);

    private final Jedis redis;

    public Cache() {
        //定义上级
        super(new FileCacheAdapter());

        this.redis = new Jedis("127.0.0.1", 16379);
        this.redis.auth("sdp_redis_6688");
    }

    @Override
    public String get(String key) {
        var value = this.redis.get(key);
        LOGGER.info("get redis cache " + key + "|" + value);
        return value;
    }

    @Override
    public String set(String key, String value) {
        LOGGER.info("set redis cache " + key + "|" + value);
        return this.redis.set(key, value);
    }

    @Override
    public String set(CacheLevel cacheLevel, String key, String value) {
        var res = this.set(key, value);

        if (cacheLevel.getWeight() > CacheLevel.GENERAL.getWeight()) {
            res = null;
        }

        return res;
    }
}
