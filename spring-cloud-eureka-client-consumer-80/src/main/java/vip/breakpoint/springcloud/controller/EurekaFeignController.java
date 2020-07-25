package vip.breakpoint.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vip.breakpoint.springcloud.service.RemoteProviderService;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@RestController
public class EurekaFeignController {

    @Autowired
    private RemoteProviderService remoteProviderService;

    @GetMapping("/consumer/feign/getServerPort")
    public String getServerPort() {
        return remoteProviderService.getServerPort();
    }

}
