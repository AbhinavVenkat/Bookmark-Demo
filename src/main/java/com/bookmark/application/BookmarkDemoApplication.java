package com.bookmark.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = "com.bookmark")
public class BookmarkDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookmarkDemoApplication.class, args);
    }

}
