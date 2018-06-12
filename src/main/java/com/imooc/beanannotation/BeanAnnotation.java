package com.imooc.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype")
@Component
public class BeanAnnotation {
    public void say(String arg) {
        System.out.println("BeanAnnotation say: "+arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation hashcode : "+ this.hashCode());
    }
}
