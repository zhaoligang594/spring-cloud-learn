package vip.breakpoint.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366.class, args);
    }

}
