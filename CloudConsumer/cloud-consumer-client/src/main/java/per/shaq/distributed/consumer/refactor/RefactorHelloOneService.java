package per.shaq.distributed.consumer.refactor;

import org.springframework.cloud.openfeign.FeignClient;
import per.shaq.distributed.consumer.HelloOneService;
import per.shaq.distributed.consumer.config.FeignConfig;

/**
 * @author: xjm
 * @date: 2019/2/25
 */
@FeignClient(value = "producer-one",configuration = FeignConfig.class)
public interface RefactorHelloOneService extends HelloOneService {
}
