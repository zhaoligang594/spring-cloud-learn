package vip.breakpoint.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.breakpoint.springcloud.service.NacosService;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/28
 */
@RestController
public class NacosConsumerController {

    @Autowired
    private NacosService nacosService;

    @GetMapping("/consumer/getConfigInfo")
    public String getConfigInfo() {
        return nacosService.getConfigInfo();
    }


}
