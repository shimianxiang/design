package com.smx.cache;

/**
 * 缓存实体
 */
public class CacheEntity {

    private final CacheLevel cacheLevel;
    private final String key;
    private final String value;
    private final Integer time;

    public CacheEntity(CacheEntityBuilder cacheEntityBuilder) {
        this.cacheLevel = cacheEntityBuilder.getCacheLevel();
        this.key = cacheEntityBuilder.getKey();
        this.value = cacheEntityBuilder.getValue();
        this.time = cacheEntityBuilder.getTime();
    }

    public CacheLevel getCacheLevel() {
        return cacheLevel;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public Integer getTime() {
        return time;
    }
}
