package per.shaq.distributed.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: xjm
 * @date: 2019/2/25
 */
@RequestMapping("/hello-service")
public interface HelloOneService {

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    String helloWorld();

    @RequestMapping(value = "/helloJava",method = RequestMethod.GET)
    String helloJava();

}
