package com.jzc.codes.web.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.jzc.codes.common.json.JSONUtil;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result {

    private Integer code;

    private String message;

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long totalCount;

    public <T> T getData(Class<T> clazz) {
        return JSONUtil.toObject(JSONUtil.toJSONString(this.data), clazz);
    }

    public <T> T getData(TypeReference<T> valueType) {
        return JSONUtil.toObject(JSONUtil.toJSONString(this.data), valueType);
    }

}
