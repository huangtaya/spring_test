package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Value("${jdbc.username}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;

    @Bean
    public MyDriverManager myDriverManager() {
        return  new MyDriverManager(userName, password, url);
    }

    @Bean(name="stringStore", initMethod = "init", destroyMethod = "destroy")
    public StringStore stringStore() {
        return new StringStore();
    }
}
