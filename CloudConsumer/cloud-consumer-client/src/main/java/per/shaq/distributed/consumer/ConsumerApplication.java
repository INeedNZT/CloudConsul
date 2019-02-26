package per.shaq.distributed.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: xjm
 * @date: 2019/2/23
 */
@EnableDiscoveryClient(autoRegister = false)
@SpringBootApplication
@EnableFeignClients(basePackages = "per.shaq.distributed.consumer.refactor")
@ComponentScan(basePackages = "per.shaq.distributed.consumer.controller")
public class ConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsumerApplication.class,args);
    }

}
