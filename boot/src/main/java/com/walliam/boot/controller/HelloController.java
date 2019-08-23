package com.walliam.boot.controller;

import com.walliam.boot.domain.sys.User;
import com.walliam.common.web.HttpResult;
import io.swagger.annotations.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Api(tags={"测试"})
@Controller
@Log4j2
public class HelloController {

    @ResponseBody
    @RequestMapping(value="hello/{id}",method = RequestMethod.POST)
    @ApiOperation(value="获取用户详情",notes = "详情")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "ID",required = true,name = "id",dataType = "String",defaultValue = "")
    })
    @ApiResponses({
            @ApiResponse(code=1000,message = "请求成功",response=User.class)
    })
    public HttpResult hello(@PathVariable(value = "id") String id, HttpServletRequest request){
        User user =  User.builder().jobNo("01585524").email("10524@qq.com").jGPhone("18629054603").orgCode("105628").build();
        log.info("-------info-------------------");
        log.error("error----");
        log.debug("debug---------");
        return HttpResult.returnSuccess(user);
    }

    @ResponseBody
    @RequestMapping(value="list",method = RequestMethod.POST)
    @ApiOperation(value="获取用户列表",notes = "列表")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "page",dataType = "int",required = true,name = "页数"),
            @ApiImplicitParam(value = "pageSize",dataType = "int",required = true,name = "每页显示数量")
    })
    @ApiResponses({
            @ApiResponse(code=1000,response = User.class,message = "成功")
    })
    public HttpResult list(@RequestParam(defaultValue = "0")int page,@RequestParam(defaultValue = "10") int pagese){
        List<User> list = new ArrayList<>();
        return HttpResult.returnSuccess(list);
    }
}
