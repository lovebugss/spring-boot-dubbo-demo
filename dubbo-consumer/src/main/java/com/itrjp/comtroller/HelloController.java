package com.itrjp.comtroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itrjp.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renjp
 * @Date 2018/12/10 15:03
 * @Version 1.0
 */
@RestController
public class HelloController {

//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference()// 如果是用zookeeper 这里无需指定url，
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.sayHello();
    }
}
