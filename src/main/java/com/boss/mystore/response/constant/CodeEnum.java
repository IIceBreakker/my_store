package com.boss.mystore.response.constant;

/**
 * @author fanghan
 */
public enum CodeEnum {

    /**
     * 成功响应码
     */
    SUCCESS(200),

    /**
     * 失败响应码
     */
    FAILURE(400);

    private int code;
    CodeEnum(int code) {
        this.code = code;
    }
    public int getCode() {
        return this.code;
    }
}
