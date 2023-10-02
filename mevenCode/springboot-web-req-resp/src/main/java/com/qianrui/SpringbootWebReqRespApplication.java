package com.qianrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"dao","com.qianrui"})     此方法不推荐
@SpringBootApplication  //默认扫描当前包及其子包
public class SpringbootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebReqRespApplication.class, args);
    }

}
