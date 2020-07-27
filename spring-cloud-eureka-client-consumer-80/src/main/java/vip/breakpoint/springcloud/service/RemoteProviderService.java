package vip.breakpoint.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/26
 */
// fallback 的兜底方法
@FeignClient(value = "cloud-eureka-client-provider", fallback = RemoteProviderServiceImpl.class)
public interface RemoteProviderService {

    // 远程服务的接口
    @GetMapping("/getServerPort")
    public String getServerPort();
}
