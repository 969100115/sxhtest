package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author purgeyao
 * @since 1.0
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.test.mapper"})
public class DisposeDemoApplication extends SpringBootServletInitializer
        implements ApplicationListener<ContextRefreshedEvent> {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(DisposeDemoApplication.class, args);
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        applicationContext = contextRefreshedEvent.getApplicationContext();
    }

}
