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
    private static final String REQUEST_URL = "http://localhost:8001/";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/getServerPort")
    public String getServerPort() {
        return restTemplate.getForObject(REQUEST_URL + "/getServerPort", String.class);
    }

}
