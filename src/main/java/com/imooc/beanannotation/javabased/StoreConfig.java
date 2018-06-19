package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

//    @Value("${jdbc.username}")
//    private String userName;
//    @Value("${password}")
//    private String password;
//    @Value("${url}")
//    private String url;

    @Autowired
    private StringStore str1;

    @Autowired
    private IntergerStore str2;

//    @Bean
//    public MyDriverManager myDriverManager() {
//        return  new MyDriverManager(userName, password, url);
//    }

//    @Bean(name="stringStore", initMethod = "init", destroyMethod = "destroy")
//    public StringStore stringStore() {
//        return new StringStore();
//    }

    @Bean
    public IntergerStore getIntegerStore() {
        return new IntergerStore();
    }

    @Bean
    public StringStore getStringStore() {
        return new StringStore();
    }

    @Bean(name = "stringStoreTest")
	public Store stringStoreTest() {
		System.out.println("str1 : " + str1.getClass().getName());
		System.out.println("str2 : " + str2.getClass().getName());
		return new StringStore();
	}
}
