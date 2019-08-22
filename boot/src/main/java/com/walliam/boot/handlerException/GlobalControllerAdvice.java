package com.walliam.boot.handlerException;

import com.walliam.common.web.HttpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalControllerAdvice {

    @ExceptionHandler({Exception.class})
    public HttpResult<?> exception(Exception e){
        e.printStackTrace();
        log.error("error" + e.getMessage());
        return HttpResult.returnFail();
    }
}
