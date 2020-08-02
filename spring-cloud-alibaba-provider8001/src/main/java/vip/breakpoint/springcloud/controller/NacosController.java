package vip.breakpoint.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/28
 */
@Slf4j
@RefreshScope
@RestController
public class NacosController {

    @Value("${config.info}")
    private String configInfo;

    @SentinelResource(value = "getConfigInfo", blockHandler = "my_blockHandler")
    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return configInfo;
    }

    // 限流返回的方法
    public String my_blockHandler(BlockException blockException) {

        return "你好，我是自定义的返回    "+ configInfo;
    }

}
