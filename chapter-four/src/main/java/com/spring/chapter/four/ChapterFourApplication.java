package com.spring.chapter.four;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ChapterFourApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterFourApplication.class, args);
    }

}
