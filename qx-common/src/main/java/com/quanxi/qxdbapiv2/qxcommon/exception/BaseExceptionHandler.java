package com.quanxi.qxdbapiv2.qxcommon.exception;

import com.quanxi.qxdbapiv2.qxcommon.common.api.ResultBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object handleException(Exception ex) {
        if (ex instanceof MaxUploadSizeExceededException) {
            return ResultBody.jsonResultFail("上传的文件大小超过系统限制！");
        } else {
            return ResultBody.jsonResultFail(ex.getMessage());
        }
    }
}
