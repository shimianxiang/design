package com.smx.event;

/**
 * 事件监听管理 模型
 */
public class App {


    public static void main(String[] args) {

        //init
        UserActiveRecord user = new UserActiveRecord();
        user.setId(1);
        user.setCode("code1");
        user.setName("name");

        //add Listener
        user.addPropertyChangeListener(new ActiveRecordListener());

        //update
        user.update();
    }
}
