package vip.breakpoint.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/26
 */
@FeignClient(value = "cloud-eureka-client-provider")
public interface RemoteProviderService {

    // 远程服务的接口
    @GetMapping("/getServerPort")
    public String getServerPort();
}
