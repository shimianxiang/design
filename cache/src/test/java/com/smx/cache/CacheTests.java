package com.smx.cache;

import com.smx.cache.strategy.GeneralCacheStrategy;
import com.smx.cache.strategy.ImportantCacheStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CacheTests {

    @Test
    public void test() {
        var cache = new Cache();
        var key1 = new ImportantCacheStrategy("KEY1");
        var key2 = new GeneralCacheStrategy("KEY2");
        var key3 = new ImportantCacheStrategy("KEY3");
        var value1 = "1";
        var value2 = "2";
        var value3 = "3";
        var res1 = cache.setCache(key1, value1);
        var res2 = cache.setCache(key2, value2);

        Assertions.assertNotNull(res1);
        Assertions.assertNotNull(res2);
        Assertions.assertEquals(value1,cache.getCache(key1),"1 failed");
        Assertions.assertEquals(value2,cache.getCache(key2),"2 failed");
        Assertions.assertEquals(value3,cache.getCache(key3),"3 failed");
    }
}
