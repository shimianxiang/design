package com.smx.cache;

import com.smx.cache.strategy.CacheStrategyInterface;

/**
 * 多级缓存模型
 */
public abstract class CacheHandler implements CacheInterface {

    /**
     * 继承处理器
     */
    private final CacheHandler successor;


    public CacheHandler(CacheHandler cache) {
        this.successor = cache;
    }

    /**
     * 设置缓存
     *
     * @param cacheStrategy 缓存策略
     * @param value         缓存值
     * @return res
     */
    public final String setCache(CacheStrategyInterface cacheStrategy, String value) {

        //获取缓存实体
        var cacheEntity = cacheStrategy.cacheEntity(value);

        //设置缓存前置操作
        cacheStrategy.BeforeSetCache();

        //设置缓存
        var res = this.set(cacheEntity.getCacheLevel(), cacheEntity.getKey(), cacheEntity.getValue());
        if (res == null) {
            res = this.successor.setCache(cacheStrategy, value);
        }

        //设置缓存后置操作
        cacheStrategy.AfterSetCache();

        return res;
    }


    /**
     * 获取缓存
     *
     * @return 缓存值
     */
    public final String getCache(CacheStrategyInterface cacheStrategy) {

        var value = this.get(cacheStrategy.toString());

        if (value == null) {
            value = this.successor.getCache(cacheStrategy);
        }

        return value;
    }

    abstract protected String set(CacheLevel cacheLevel, String key, String value);
}
