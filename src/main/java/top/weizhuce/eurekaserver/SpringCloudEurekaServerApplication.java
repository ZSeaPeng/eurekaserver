package top.weizhuce.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zseapeng on 2018/02/09
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class,args);
    }
}
