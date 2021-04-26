package com.smx.cache;

public interface CacheInterface {

    String get(String key);

    String set(String key, String value);
}
