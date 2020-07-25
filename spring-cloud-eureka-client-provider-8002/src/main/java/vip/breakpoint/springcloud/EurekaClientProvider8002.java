package vip.breakpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientProvider8002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider8002.class, args);
    }
}
