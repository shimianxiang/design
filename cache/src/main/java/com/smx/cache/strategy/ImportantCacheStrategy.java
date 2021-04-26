package com.smx.cache.strategy;

import com.smx.cache.CacheEntity;
import com.smx.cache.CacheEntityBuilder;
import com.smx.cache.CacheLevel;

/**
 * Example.重要-缓存策略
 */
public final class ImportantCacheStrategy implements CacheStrategyInterface {

    private static final String CACHE_HEAD = "Important:";
    private final String key;

    public ImportantCacheStrategy(String key) {
        this.key = ImportantCacheStrategy.CACHE_HEAD + key;
    }

    @Override
    public CacheEntity cacheEntity(String value) {
        return new CacheEntityBuilder(this.key)
                .withValue(value)
                .withCacheLevel(CacheLevel.IMPORTANT)
                .withTime(3600)
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
