package com.product.recycle.model;

import lombok.Builder;
import lombok.Data;

/**
 * @desc ajax response
 */
@Data
@Builder
public class AjaxResult {
    private static final long serialVersionUID = 1L;
    private static final int SUCCESS = 200; //success code
    private static final int FAILURE = 500;//fail code

    private int code;
    private String message;
    private Object data;

    public static AjaxResult success(){
        return success("success",null);
    }

    public static AjaxResult error(){
        return success("fail",null);
    }

    public static AjaxResult success(Object data){
        return success("success",data);
    }

    public static AjaxResult success(String message){
        return success(message,null);
    }

    public static AjaxResult error(String message){
        return error(message,null);
    }

    public static AjaxResult success(String message, Object data){
         return AjaxResult.builder()
                .code(SUCCESS)
                .message(message)
                .data(data)
                .build();
    }

    public static AjaxResult error(String message, Object data){
        return AjaxResult.builder()
                .code(FAILURE)
                .message(message)
                .data(data)
                .build();
    }

}
