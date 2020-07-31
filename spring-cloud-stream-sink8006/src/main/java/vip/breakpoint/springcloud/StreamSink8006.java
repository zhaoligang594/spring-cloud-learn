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
public class StreamSink8006 {

    public static void main(String[] args) {
        SpringApplication.run(StreamSink8006.class, args);
    }
}
