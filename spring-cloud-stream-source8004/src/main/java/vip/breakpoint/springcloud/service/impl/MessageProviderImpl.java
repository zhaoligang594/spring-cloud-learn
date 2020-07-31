package vip.breakpoint.springcloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import vip.breakpoint.springcloud.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/31
 */
@Slf4j
@EnableBinding({Source.class})
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send(String message) {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("**************serial={}", serial);
        return serial;

    }
}
