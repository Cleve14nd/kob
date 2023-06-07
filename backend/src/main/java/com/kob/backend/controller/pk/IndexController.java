package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * Package: com.kob.backend.controller.pk
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/6/4 18:57
 * @Version 1.0
 */

@Controller
public class IndexController {

    @RequestMapping("/pk/index/")
    public String index(){
        return "/pk/index.html";
    }
}
