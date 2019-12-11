package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>iTrip项目注册中心Eureka Server启动类</b>
 * @author Arthur
 * @version 3.1.0 2019-12-11
 * @since 3.1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class itripEurekaServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(itripEurekaServerStarter.class, args);
	}
}
