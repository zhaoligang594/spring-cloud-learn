package vip.breakpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Stream8004 {
    public static void main(String[] args) {
        SpringApplication.run(Stream8004.class, args);
    }
}
