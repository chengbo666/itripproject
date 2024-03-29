package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>项目认证子项目Consumer启动类</b>
 * @author Arthur
 * @version 3.1.0 2019-12-12
 * @since 3.1.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ItripAuthConsumerStarter {
	public static void main( String[] args ) {
		SpringApplication.run(ItripAuthConsumerStarter.class, args);
	}
}

