package com.lqiuqiu.entity;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String description;

    public User(Integer userid, String username, String password, String description) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}