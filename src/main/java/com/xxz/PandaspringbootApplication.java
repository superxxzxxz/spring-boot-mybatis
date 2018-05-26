package com.xxz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * springboot启动类，从上往下扫描，所以在包目录顶层
 * 否则注入失败
 *
 * @author xxz
 */
@SpringBootApplication
@MapperScan("com.xxz.dao")
public class PandaspringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(PandaspringbootApplication.class, args);
    }
}
