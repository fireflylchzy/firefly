package com.firefly;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author nacos
 * <p>
 * nacos console 源码运行，方便开发 生产从官网下载zip最新版集群配置运行
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class FireflyNacosApplication {

    public static void main(String[] args) {

            SpringApplication.run(FireflyNacosApplication.class, args);

    }



}
