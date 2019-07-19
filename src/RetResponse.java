package com.gdm.web.ret;

/**
 * @Description: 将结果转换为封装后的对象
 * @author daifuxiang
 * @date 2019/06/11 17:04
 */
public class RetResponse {
 
   private final static String SUCCESS = "success";
 
   public static <T> RetResult<T> makeOKRsp() {
      return new RetResult<T>().setStatus(RetStatus.SUCCESS).setMsg(SUCCESS);
   }
 
   public static <T> RetResult<T> makeOKRsp(T data) {
      return new RetResult<T>().setStatus(RetStatus.SUCCESS).setMsg(SUCCESS).setData(data);
   }
 
   public static <T> RetResult<T> makeErrRsp(String message) {
      return new RetResult<T>().setStatus(RetStatus.FAIL).setMsg(SUCCESS);
   }
 
   public static <T> RetResult<T> makeRsp(int status, String msg) {
      return new RetResult<T>().setStatus(status).setMsg(msg);
   }
    
   public static <T> RetResult<T> makeRsp(int status, String msg, T data) {
      return new RetResult<T>().setStatus(status).setMsg(msg).setData(data);
   }
}