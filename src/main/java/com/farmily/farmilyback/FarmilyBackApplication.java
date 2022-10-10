package com.farmily.farmilyback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // DB연결할 때 지우기
public class FarmilyBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmilyBackApplication.class, args);
    }

}
