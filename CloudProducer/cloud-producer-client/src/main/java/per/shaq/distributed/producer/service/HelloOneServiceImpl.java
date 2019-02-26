package per.shaq.distributed.producer.service;

import org.springframework.web.bind.annotation.RestController;
import per.shaq.distributed.consumer.HelloOneService;

/**
 * @author: xjm
 * @date: 2019/2/25
 */
@RestController
public class HelloOneServiceImpl implements HelloOneService {

    public String helloWorld() {
        return "hello world";
    }

    public String helloJava() {
        return "hello java";
    }
}
