package vip.breakpoint.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author :breakpoint/赵立刚
 * @date : 2020/07/27
 */
@Component
public class RemoteProviderServiceImpl implements RemoteProviderService {
    @Override
    public String getServerPort() {
        return "return from RemoteProviderServiceImpl 哭哭哭";
    }
}
