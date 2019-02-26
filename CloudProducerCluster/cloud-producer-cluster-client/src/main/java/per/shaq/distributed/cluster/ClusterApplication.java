package per.shaq.distributed.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: xjm
 * @date: 2019/2/24
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "per.shaq.distributed.cluster.service")
public class ClusterApplication {

    public static void main(String[] args){
        SpringApplication.run(ClusterApplication.class,args);
    }

}
