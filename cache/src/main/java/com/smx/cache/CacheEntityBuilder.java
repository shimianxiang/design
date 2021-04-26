package com.smx.cache;

public class CacheEntityBuilder {
    private final String key;
    private CacheLevel cacheLevel;
    private String value;
    private Integer time;

    public CacheEntityBuilder(String key) {
        if (key == null) {
            //exception
        }
        this.key = key;
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

    public CacheEntityBuilder withCacheLevel(CacheLevel cacheLevel) {
        this.cacheLevel = cacheLevel;
        return this;
    }

    public CacheEntityBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public CacheEntityBuilder withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * builder
     *
     * @return 缓存实体
     */
    public CacheEntity build() {
        return new CacheEntity(this);
    }
}
