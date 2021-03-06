package com.zhongsou.souyue.db.homepage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table HOME_LIST.
 */
public class HomeList {

    private String id_type_time;
    private String id;
    private String type;
    private String time;
    private String data;

    public HomeList() {
    }

    public HomeList(String id_type_time) {
        this.id_type_time = id_type_time;
    }

    public HomeList(String id_type_time, String id, String type, String time, String data) {
        this.id_type_time = id_type_time;
        this.id = id;
        this.type = type;
        this.time = time;
        this.data = data;
    }

    public String getId_type_time() {
        return id_type_time;
    }

    public void setId_type_time(String id_type_time) {
        this.id_type_time = id_type_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
