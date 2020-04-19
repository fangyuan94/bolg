package com.fy.bolg.handler;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 处理公共异常处理机制
 * @author fangyuan
 */
@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Map<String,Object> handleException(final Exception re) {
        re.printStackTrace();
        Map<String,Object> rs = new HashMap<>();
        rs.put("success",false);
        rs.put("errorMessage",re.getMessage());
        return rs;
    }

}
