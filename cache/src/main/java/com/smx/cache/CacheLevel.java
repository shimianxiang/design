package com.smx.cache;

public enum CacheLevel {
    GENERAL(1), IMPORTANT(2);

    private final Integer weight;

    CacheLevel(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
}
