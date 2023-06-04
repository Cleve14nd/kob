package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: BotInfoController
 * Package: com.kob.backend.controller.pk
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/4 19:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<String> getBotInfo(){
        List<String> list=new LinkedList<>();
        list.add("sword");
        list.add("tiger");
        list.add("apple");
        return list;
    }

}
