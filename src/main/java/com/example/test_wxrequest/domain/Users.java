package com.example.test_wxrequest.domain;


import java.util.Date;


public class Users {
    private Integer user_id;

    private String user_name;

    private String user_pwds;

    private Date user_times;

    private String user_images;

    public Users(Integer user_id, String user_name, String user_pwds, Date user_times, String user_images) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pwds = user_pwds;
        this.user_times = user_times;
        this.user_images = user_images;
    }

    public Users() {
        super();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwds() {
        return user_pwds;
    }

    public void setUser_pwds(String user_pwds) {
        this.user_pwds = user_pwds;
    }

    public Date getUser_times() {
        return user_times;
    }

    public void setUser_times(Date user_times) {
        this.user_times = user_times;
    }

    public String getUser_images() {
        return user_images;
    }

    public void setUser_images(String user_images) {
        this.user_images = user_images;
    }

}
