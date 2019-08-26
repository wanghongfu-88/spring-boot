package com.walliam.boot.controller;

import com.walliam.boot.domain.sys.User;
import com.walliam.boot.service.IUserService;
import com.walliam.common.web.HttpResult;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Api(tags={"测试"})
@Controller
@Slf4j
public class HelloController {

    @Autowired
    private IUserService iUserService;

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
        //TODO 使用lombak 构造模式
        User user =  iUserService.getUserOne(1000L);

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
