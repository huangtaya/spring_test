package com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;


    @Autowired(required = false)
    @Qualifier("BeanImplTwo")
    private BeanInterface beanInterface;

    public void say() {
        if (list != null && list.size() != 0) {
            System.out.println("list.....");
            for(BeanInterface bean : list) {
                System.out.println(bean.getClass().getName());
            }
        } else {
            System.out.println("list is null=====");
        }

        System.out.println("++++++++++++");

        if (map != null && 0 != map.size()) {
            System.out.println("map +++++");
           for(Map.Entry<String, BeanInterface> entry : map.entrySet()) {
               System.out.println("key:" + entry.getKey()+" calssname:"+ entry.getValue().getClass().getName());
           }
        } else {
            System.out.println("map is null");
        }


        System.out.println("--------------");
        if (null != beanInterface) {
            System.out.println("beanInterface:" + beanInterface.getClass().getName());
        } else {
            System.out.println("beanInterface is null");
        }
    }
}
