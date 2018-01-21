package com.gd.minierp.auth;


import com.gd.minierp.common.bean.ResultBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class LoginController {


    @GetMapping("")
    public ResultBean verificationLogin(@RequestParam("phone") String phone,
                                        @RequestParam("password") String password) {
        return ResultBean.buildErrorResult("登录失败");
    }
}
