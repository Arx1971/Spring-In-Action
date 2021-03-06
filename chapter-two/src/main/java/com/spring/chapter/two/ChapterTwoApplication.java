package com.spring.chapter.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ChapterTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterTwoApplication.class, args);
    }

}
