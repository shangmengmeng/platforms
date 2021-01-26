package com.star.platforms.common;

public class FailResultBean <T> extends ResultBean<T>{
    public FailResultBean(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
