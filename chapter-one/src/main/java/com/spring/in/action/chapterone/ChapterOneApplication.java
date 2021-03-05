package com.spring.in.action.chapterone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ChapterOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterOneApplication.class, args);
    }

}
