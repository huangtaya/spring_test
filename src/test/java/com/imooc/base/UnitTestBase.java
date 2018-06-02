package com.imooc.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {
    private ClassPathXmlApplicationContext context;

    private String path;

    public UnitTestBase() {}

    public UnitTestBase(String path) {
        this.path = path;
    }

    @Before
    public void before() {
        if(StringUtils.isEmpty(path)) {
            path = "classpath*:spring-*.xml";
        }

        try {
            context = new ClassPathXmlApplicationContext(path.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId) {
        try {
            return (T)this.context.getBean(beanId);
        }catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> bean) {
        try {
            return context.getBean(bean);
        }catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }
}
