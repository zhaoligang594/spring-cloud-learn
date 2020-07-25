package vip.breakpoint.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@RestController
public class EurekaConsumerController {

    // CLOUD-EUREKA-CLIENT-PROVIDER 是我们的服务提供者的名字
    private static final String REQUEST_URL = "http://CLOUD-EUREKA-CLIENT-PROVIDER";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/getServerPort")
    public String getServerPort() {
        return restTemplate.getForObject(REQUEST_URL + "/getServerPort", String.class);
    }

}
