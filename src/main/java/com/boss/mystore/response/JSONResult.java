package com.boss.mystore.response;

import com.boss.mystore.response.constant.CodeEnum;
import com.boss.mystore.response.constant.MessageEnum;
import lombok.Data;

/**
 * 封装Controller的返回格式
 *
 * @param <T> 返回数据的类型
 * @author fanghan
 */
@Data
public class JSONResult<T> {

    private T data;
    private Integer code;
    private String msg;

    public JSONResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> JSONResult<T> success() {
        return new JSONResult<>(CodeEnum.SUCCESS.getCode(), null, null);
    }

    public static <T> JSONResult<T> success(String msg, T data) {
        return new JSONResult<>(CodeEnum.SUCCESS.getCode(), msg, data);
    }

    public static <T> JSONResult<T> success(T data) {
        return new JSONResult<>(CodeEnum.SUCCESS.getCode(), MessageEnum.LOGIN_SUCCESS.getMsg(), data);
    }

    public static <T> JSONResult<T> fail() {
        return new JSONResult<>(CodeEnum.FAILURE.getCode(), MessageEnum.LOGIN_FAILURE.getMsg(), null);
    }
}
