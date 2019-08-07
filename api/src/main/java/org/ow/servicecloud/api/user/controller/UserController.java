package org.ow.servicecloud.api.user.controller;

import org.ow.servicecloud.api.user.request.RegisterReqData;
import org.ow.servicecloud.api.user.vo.RegisterVo;
import org.ow.servicecloud.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : owen
 * @email zhaoouyang163@gmail.com
 * @date : 2019/8/6
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public RegisterVo register(RegisterReqData userRegisterReq){

        RegisterVo registerVo=null;

        // 保存用户信息
        userService.registerUser(userRegisterReq.getPhone(),userRegisterReq.getPassword());

        // 构建token返回
        

        return registerVo;
    }

}
