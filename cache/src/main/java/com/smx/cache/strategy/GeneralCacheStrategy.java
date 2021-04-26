package com.smx.cache.strategy;

import com.smx.cache.CacheEntity;
import com.smx.cache.CacheEntityBuilder;
import com.smx.cache.CacheLevel;

/**
 * Example.一般-缓存策略
 */
public class GeneralCacheStrategy implements CacheStrategyInterface {

    private static final String CACHE_HEAD = "General:";
    private final String key;

    public GeneralCacheStrategy(String key) {
        this.key = GeneralCacheStrategy.CACHE_HEAD + key;
    }

    @Override
    public CacheEntity cacheEntity(String value) {
        return new CacheEntityBuilder(this.key)
                .withValue(value)
                .withCacheLevel(CacheLevel.GENERAL)
                .withTime(60)
                .build();
    }

    @Override
    public void BeforeSetCache() {
        //todo
    }

    @Override
    public void AfterSetCache() {
        //todo
    }

    @Override
    public String toString() {
        return this.key;
    }
}
