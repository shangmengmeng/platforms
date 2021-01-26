package com.star.platforms.model;

public class User {
    private String username;

    private String userId;

    private String password;

    private String telephone;

    private String email;

    private String avatorl;

    private String nickname;

    private Byte gender;

    public User(String username, String userId, String password, String telephone, String email, String avatorl, String nickname, Byte gender) {
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.telephone = telephone;
        this.email = email;
        this.avatorl = avatorl;
        this.nickname = nickname;
        this.gender = gender;
    }

    public User() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatorl() {
        return avatorl;
    }

    public void setAvatorl(String avatorl) {
        this.avatorl = avatorl == null ? null : avatorl.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }
}