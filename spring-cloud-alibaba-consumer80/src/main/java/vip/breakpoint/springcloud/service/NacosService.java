package vip.breakpoint.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/28
 */
@FeignClient(value = "cloud-alibaba-prvider")
public interface NacosService {

    @GetMapping("/getConfigInfo")
    public String getConfigInfo();

}
