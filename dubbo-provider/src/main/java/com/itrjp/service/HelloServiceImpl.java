package com.itrjp.service;/**
 * Created by renjp on 2018/12/10.
 */

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author renjp
 * @Date 2018/12/10 14:58
 * @Version 1.0
 */
@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "hello";
    }
}
