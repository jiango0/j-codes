package com.jzc.codes.web.result;

public class ResultGenerator {

    public static Result successResult() {
        return Result.builder()
                .code(ResultCode.SUCCESS.getCode())
                .message(ResultCode.SUCCESS.getMessage())
                .data(null)
                .build();
    }

    public static Result successResult(Object data) {
        return Result.builder()
                .code(ResultCode.SUCCESS.getCode())
                .message(ResultCode.SUCCESS.getMessage())
                .data(data)
                .build();
    }

    public static Result successResult(Object data, long totalCount) {
        return Result.builder()
                .code(ResultCode.SUCCESS.getCode())
                .message(ResultCode.SUCCESS.getMessage())
                .data(data)
                .totalCount(totalCount)
                .build();
    }

    public static Result failResult(String message) {
        return Result.builder()
                .code(ResultCode.FAIL.getCode())
                .message(message)
                .build();
    }

}
