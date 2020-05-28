package com.fh.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * @author Y7000
 * 全局异常处理
 */
@RestControllerAdvice
public class MyGlobalExceptionHandler {

    //大异常  如果自己下面没对应的 具体异常 就返回这个

    @ExceptionHandler
    public ResponseServer exception(Exception e){
        e.printStackTrace();
        return ResponseServer.error();
    }

    //数字转化异常

    @ExceptionHandler
    public ResponseServer NumberFormatException(MethodArgumentTypeMismatchException e){
       e.printStackTrace();
        return ResponseServer.errorWithMyEnum(MyEnum.NUMBER_FORMAT_EXCEPTION);
    }
}
