package com.pancm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
* @Title: ZuulServerApplication1
* @Description:
* 程序入口 
* @Version:1.0.0  
* @author pancm
* @date 2018年3月29日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulServerApplication1 {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication1.class, args);
		  System.out.println("zuul 第一个服务启动...");
	}
}