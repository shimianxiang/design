package com.smx.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 事件监听
 */
public class ActiveRecordListener implements PropertyChangeListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveRecordListener.class);

    /**
     * 监听变化
     *
     * @param evt 事件
     */
    public void propertyChange(PropertyChangeEvent evt) {
        LOGGER.info(evt.toString());

        if (evt instanceof ActiveRecordUpdateEvent) {
            ((ActiveRecordUpdateEvent) evt).handle();
        }
    }

    public void propertyChange(ActiveRecordUpdateEvent evt) {
        evt.handle();
    }
}
