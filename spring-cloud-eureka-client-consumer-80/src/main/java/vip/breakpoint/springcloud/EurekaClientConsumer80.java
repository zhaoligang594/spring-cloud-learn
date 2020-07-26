package vip.breakpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer80.class, args);
    }

}
