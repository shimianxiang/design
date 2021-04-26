package com.smx.event;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * demo ActiveRecord
 */
public abstract class ActiveRecord {

    //事件支持
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public final static String ACTIVE_RECORD_UPDATE = "ACTIVE_RECORD_UPDATE";

    public void update() {

        this.beforeUpdate();

        //update

        this.afterUpdate();
    }

    public void beforeUpdate() {
        //todo
    }

    public void afterUpdate() {
        changeSupport.firePropertyChange(new ActiveRecordUpdateEvent(this, ActiveRecord.ACTIVE_RECORD_UPDATE, "oldValue", "deviceStatus"));
    }

    /**
     * 获取缓存键值
     *
     * @return cacheKey
     */
    public abstract String getCacheKey();

    /**
     * 添加事件监听
     *
     * @param listener 监听器
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    /**
     * 一处事件监听
     *
     * @param listener 监听器
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
