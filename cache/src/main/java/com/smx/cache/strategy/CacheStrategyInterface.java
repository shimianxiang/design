package com.smx.cache.strategy;

import com.smx.cache.CacheEntity;

/**
 * 缓存策略接口
 */
public interface CacheStrategyInterface {
    /**
     * 获取设置缓存实体
     *
     * @return 缓存实体
     */
    CacheEntity cacheEntity(String value);

    void BeforeSetCache();

    void AfterSetCache();

    //other.......
}
