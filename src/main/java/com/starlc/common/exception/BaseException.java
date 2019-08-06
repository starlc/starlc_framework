package com.starlc.common.exception;

import com.starlc.common.enums.ErrorCode;

import java.util.HashMap;
import java.util.Map;
/**
* @Description:    异常基类
* @Author:         liuc
* @CreateDate:     2019/8/5 11:14
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public abstract class BaseException extends RuntimeException {
    private final ErrorCode code = ErrorCode.HTTP;
    private final Map<String, Object> data = new HashMap();

}