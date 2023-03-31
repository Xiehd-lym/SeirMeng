package com.haidong.SeirMeng.service.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.haidong.SeirMeng"})
//@EnableSwagger2
@MapperScan(basePackages = {"com.haidong.SeirMeng.service.edu.mapper"})
public class SeirMengEducationApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeirMengEducationApplication.class,args);
    }
}
