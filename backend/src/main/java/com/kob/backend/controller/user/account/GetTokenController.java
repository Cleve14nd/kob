package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.GetTokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LoginController
 * Package: com.kob.backend.controller.user.account
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/7 2:45
 * @Version 1.0
 */

@RestController
public class GetTokenController {
    @Autowired
    public GetTokenService getTokenService;

    @PostMapping("/user/account/token/")
    public Map<String,String> getToken(@RequestParam Map<String,String> map){
        String username=map.get("username");
        String password=map.get("password");
        return getTokenService.getToken(username,password);


    }

}
