package vip.breakpoint.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/27
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return "from config client,config info is" + configInfo;
    }

}
