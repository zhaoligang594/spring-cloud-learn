package vip.breakpoint.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@Slf4j
@RestController
public class EurekaProviderController {

    @Value("${server.port}")
    private String serverPort;

    //    @HystrixCommand(fallbackMethod = "my_fallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000") // 测试请求超时
//    })
    @GetMapping("/getServerPort")
    public String getServerPort() {

        //int a = 1 / 0;// 写一个异常

        return "return from the provider,port is " + serverPort;
    }

    public String my_fallbackMethod() {
        return "return from the provider ,this is my_fallbackMethod ,port is " + serverPort;
    }
}
