package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {

    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init");
    }

    public void start() {
        System.out.println("bean start");
    }

    public void stop() {
        System.out.println("bean stop");
    }

    public void defaultInit() {
        System.out.println("defaultInit");
    }

    public void defaultDestroy() {
        System.out.println("defaultDestroy");
    }
}
