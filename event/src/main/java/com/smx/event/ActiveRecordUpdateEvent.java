package com.smx.event;

import com.smx.cache.Cache;
import com.smx.cache.strategy.GeneralCacheStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;

/**
 * 记录变更 事件
 */
public class ActiveRecordUpdateEvent extends PropertyChangeEvent {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveRecordUpdateEvent.class);

    /**
     * Constructs a new {@code PropertyChangeEvent}.
     *
     * @param source       the bean that fired the event
     * @param propertyName the programmatic name of the property that was changed
     * @param oldValue     the old value of the property
     * @param newValue     the new value of the property
     * @throws IllegalArgumentException if {@code source} is {@code null}
     */
    public ActiveRecordUpdateEvent(ActiveRecord source, String propertyName, Object oldValue, Object newValue) {
        super(source, propertyName, oldValue, newValue);
    }

    /**
     * handle
     */
    public void handle() {
        // LOGGER.info(this.source.toString());

        // to cache
        var cache = new Cache();
        GeneralCacheStrategy userKey = new GeneralCacheStrategy(((UserActiveRecord) this.source).getCacheKey());
        var res2 = cache.setCache(userKey, this.source.toString());
    }
}
