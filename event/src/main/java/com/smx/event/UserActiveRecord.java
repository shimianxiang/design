package com.smx.event;

/**
 * demo 用户记录
 */
public class UserActiveRecord extends ActiveRecord {

    protected Integer id;
    protected String code;
    protected String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCacheKey() {
        return this.code;
    }

    @Override
    public String toString() {
        return "UserActiveRecord{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
