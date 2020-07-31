package vip.breakpoint.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vip.breakpoint.springcloud.service.IMessageProvider;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/31
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sentMessage/{message}")
    public String sendMessage(@PathVariable("message") String message) {
        return iMessageProvider.send(message);
    }
}
