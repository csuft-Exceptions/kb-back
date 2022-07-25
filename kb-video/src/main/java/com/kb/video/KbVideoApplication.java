package com.kb.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.kb.*"}, scanBasePackageClasses ={KbVideoApplication.class})
@EnableDiscoveryClient
@MapperScan("com.kb.video.dao.mapper")
public class KbVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KbVideoApplication.class, args);
    }
}
