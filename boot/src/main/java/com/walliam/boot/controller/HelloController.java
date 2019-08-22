package com.walliam.boot.controller;

import com.walliam.boot.domain.sys.User;
import com.walliam.common.web.HttpResult;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value="hello")
    public HttpResult hello(){
        User user =  User.builder().jobNo("01585524").email("10524@qq.com").jGPhone("18629054603").orgCode("105628").build();
        return HttpResult.returnSuccess(user);
    }
}
