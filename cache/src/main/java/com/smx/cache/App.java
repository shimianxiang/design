package com.smx.cache;

import com.smx.cache.strategy.ImportantCacheStrategy;
import com.smx.cache.strategy.GeneralCacheStrategy;

/**
 * 多级缓存模型
 * <p>
 * 1.责任链模式，多级缓存实现基础
 * 2.适配器模式，多种缓存载体实现统一缓存接口
 * 3.策略模式，多种缓存策略
 * 4.建造者模式，建造缓存策略实体对象
 */
public class App {


    public static void main(String[] args) {

        var cache = new Cache();

        var key1 = new ImportantCacheStrategy("KEY1");
        var key2 = new GeneralCacheStrategy("KEY2");
        var key3 = new ImportantCacheStrategy("KEY3");

        var res1 = cache.setCache(key1, "1");
        var res2 = cache.setCache(key2, "2");

        var value1 = cache.getCache(key1);
        var value2 = cache.getCache(key2);
        var value3 = cache.getCache(key3);
    }
}
