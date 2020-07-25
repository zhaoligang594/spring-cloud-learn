package vip.breakpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EurekaClientProvider8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider8001.class, args);
    }
}
