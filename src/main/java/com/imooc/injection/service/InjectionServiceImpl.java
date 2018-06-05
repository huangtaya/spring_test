package com.imooc.injection.service;

import com.imooc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {
    private InjectionDAO injectionDAO;

    public InjectionServiceImpl() {}

    public InjectionServiceImpl(InjectionDAO dao) {
        injectionDAO = dao;
    }

    public void save(String arg) {
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();

        injectionDAO.save(arg);
    }

    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
