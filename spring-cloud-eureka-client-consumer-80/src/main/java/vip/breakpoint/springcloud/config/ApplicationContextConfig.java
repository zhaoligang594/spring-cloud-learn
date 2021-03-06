package vip.breakpoint.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/25
 */
@Configuration
public class ApplicationContextConfig {

    @LoadBalanced // 进行负载均衡
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}