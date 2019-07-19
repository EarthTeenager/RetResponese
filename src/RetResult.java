package com.gdm.web.ret;

/**
 * @Description: 返回对象实体
 * @author daifuxiang
 * @date 2019/06/11 17:04
 */
public class RetResult<T>
{

    public int status;

    private String msg;

    private T data;

    public RetResult<T> setStatus(RetStatus retStatus)
    {
        this.status = retStatus.status;
        return this;
    }

    public int getStatus()
    {
        return status;
    }

    public RetResult<T> setStatus(int status)
    {
        this.status = status;
        return this;
    }

    public String getMsg()
    {
        return msg;
    }

    public RetResult<T> setMsg(String msg)
    {
        this.msg = msg;
        return this;
    }

    public T getData()
    {
        return data;
    }

    public RetResult<T> setData(T data)
    {
        this.data = data;
        return this;
    }

}
