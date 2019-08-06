package com.starlc.common.enums;

/**
* @Description:    错误编码枚举
* @Author:         liuc
* @CreateDate:     2019/8/5 11:16
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public enum ErrorCode {
    HTTP(1001);
    private int value;

    ErrorCode(int value) {
        this.value = value;
    }
}
