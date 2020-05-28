package com.fh.controller;



/**
 * @author Y7000
 * 统一的返回参数处理
 */
public class ResponseServer {

  private Integer code;

  private String msg;

  private Object data;


  /**
   * 操作失败
   * @return
   */
  public static ResponseServer error() {
    return new ResponseServer(MyEnum.ERROR.getCode(),MyEnum.ERROR.getMsg(),null);
  }

  /**
   * 操作失败并返回信息 根据传入的 枚举的 类 获取对应的信息
   * @return
   */
  public static ResponseServer errorWithMyEnum(MyEnum myEnum) {
    return new ResponseServer(myEnum.getCode(),myEnum.getMsg(),null);
  }
  /**
   * 请求处理成功且不需要返回数据和消息时使用的工具方法
   * @return
   */
  public static ResponseServer successWithoutData() {
    return new ResponseServer(MyEnum.SUCCESS.getCode(),MyEnum.SUCCESS.getMsg(),null);
  }
  /**
   * 请求处理成功且需要返回数据时使用的工具方法
   * @return
   */
  public static ResponseServer successWithData(Object data) {
    return new ResponseServer(MyEnum.SUCCESS.getCode(),MyEnum.SUCCESS.getMsg(),data);
  }


  /**
   * 请求处理失败后使用的工具方法
   *
   * @return
   */
  public static ResponseServer failedWithoutData(){
    return new ResponseServer(MyEnum.FAILURE.getCode(),MyEnum.FAILURE.getMsg(),null);
  }
  /**
   * 请求处理失败后仍然需要传递参数使用的工具方法
   *
   * @return
   */
  public static ResponseServer failedWithData(Object data){
    return new ResponseServer(MyEnum.FAILURE.getCode(),MyEnum.FAILURE.getMsg(),data);
  }


  public ResponseServer() {
  }

  public ResponseServer(Integer code, String msg, Object data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
