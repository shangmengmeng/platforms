package com.star.platforms.model;

import java.util.Date;

public class ChatUser {
    private String uid;

    private String userid;

    private String nikename;

    private Integer offline;

    private Date createTime;

    private Integer type;

    private String avatar;

    public ChatUser(String uid, String userid, String nikename, Integer offline, Date createTime, Integer type, String avatar) {
        this.uid = uid;
        this.userid = userid;
        this.nikename = nikename;
        this.offline = offline;
        this.createTime = createTime;
        this.type = type;
        this.avatar = avatar;
    }

    public ChatUser() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }

    public Integer getOffline() {
        return offline;
    }

    public void setOffline(Integer offline) {
        this.offline = offline;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }
}