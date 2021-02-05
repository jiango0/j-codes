package com.jzc.codes.web.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ResultCode {

    SUCCESS(200, "成功"),
    FAIL(400, "失败"),
    UN_AUTHORIZED(403, "未授权"),
    NOT_FOUND(404, "接口不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误")
    ;

    @Getter
    private int code;
    @Getter
    private String message;

}
