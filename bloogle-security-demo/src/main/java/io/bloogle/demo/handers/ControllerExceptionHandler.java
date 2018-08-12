package io.bloogle.demo.handers;

import io.bloogle.demo.exceptions.MyExecption;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cmlanche on 2018/8/12.
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MyExecption.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleTestException(MyExecption execption) {
        Map<String, String> map = new HashMap<>();
        map.put("id", execption.getId());
        map.put("message", execption.getClass().getCanonicalName());
        return map;
    }
}
