package vip.breakpoint.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@Slf4j
@RestController
public class EurekaProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getServerPort")
    public String getServerPort() {
        return "return from the provider,port is " + serverPort;
    }
}
