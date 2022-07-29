package com.haidong.SeirMeng.service.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author xiehd
 * @Date 2022 07 29
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.haidong.SeirMeng"})
public class SeirMengTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeirMengTestApplication.class,args);
    }
}
