package per.shaq.distributed.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import per.shaq.distributed.consumer.refactor.RefactorHelloOneService;


/**
 * @author: xjm
 * @date: 2019/2/25
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    RefactorHelloOneService refactorHelloOneService;

    @RequestMapping(value = "/world",method = RequestMethod.GET)
    public String getHelloWorld(){
        return refactorHelloOneService.helloWorld();
    }

    @RequestMapping("/java")
    public String getHelloJava(){
        return refactorHelloOneService.helloJava();
    }

}
