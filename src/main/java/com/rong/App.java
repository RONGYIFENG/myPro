package com.rong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author rong
 * Create by rong on ${Date}
 */
@SpringBootApplication
@EnableWebMvc
@EnableTransactionManagement
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
