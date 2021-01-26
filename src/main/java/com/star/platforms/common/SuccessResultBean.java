package com.star.platforms.common;

public class SuccessResultBean<T> extends ResultBean<T> {
    private int code = 200;
    private String message ="成功";
    private T data;

    private SuccessResultBean() {
    }

    public SuccessResultBean(T data) {
        this.data = data;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
