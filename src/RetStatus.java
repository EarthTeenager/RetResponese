package com.gdm.web.ret;

/**
 * @Description: 响应码枚举，参考HTTP状态码的语义
 * @author daifuxiang
 * @date 2019/06/11 17:04
 */
public enum RetStatus
{

    // 成功
    SUCCESS(200),

    // 失败
    FAIL(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    // 接口不存在
    NOT_FOUND(404),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int status;

    RetStatus(int status)
    {
        this.status = status;
    }
}
