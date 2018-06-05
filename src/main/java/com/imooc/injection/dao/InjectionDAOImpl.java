package com.imooc.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {

    public void save(String arg) {
        System.out.println("保存数据：" + arg);
    }
}
