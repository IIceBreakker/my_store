package com.boss.mystore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fanghan
 */
@MapperScan("com.boss.mystore.mapper")
@SpringBootApplication
public class MystoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MystoreApplication.class, args);
    }

}
