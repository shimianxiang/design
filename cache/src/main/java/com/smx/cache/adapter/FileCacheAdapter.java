package com.smx.cache.adapter;

import com.smx.cache.CacheHandler;
import com.smx.cache.CacheLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 文件缓存适配器
 */
public final class FileCacheAdapter extends CacheHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileCacheAdapter.class);

    public FileCacheAdapter() {
        super(null);
    }

    @Override
    public String get(String key) {
        LOGGER.info("get file cache " + key);
        //todo get
        return "get file cache";
    }

    @Override
    public String set(String key, String value) {
        LOGGER.info("set file cache " + key + "|" + value);
        //todo set
        return "set file cache";
    }

    @Override
    protected String set(CacheLevel cacheLevel, String key, String value) {
        return this.set(key, value);
    }
}
