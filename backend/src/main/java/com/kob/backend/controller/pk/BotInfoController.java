package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
    public Map<String,String> getBotInfo(){
        Map<String,String> map=new HashMap<>();
        map.put("name1","sword");
        map.put("name2","tiger");
        return map;
    }

}
