package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "JsrServie")
public class JsrServie {
    @Resource
    private JsrDAO dao;

//    @Resource
    public void setDao(JsrDAO dao) {
        this.dao = dao;
    }

    public void save() {
        dao.save();
    }
}
