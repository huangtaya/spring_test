package com.imooc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MoocResource implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() {
        Resource resource = applicationContext.getResource("classpath:config.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(resource.getFile()));
            String tmpStr = null;
            while ((tmpStr = reader.readLine()) != null)  {
                System.out.println("content:" + tmpStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(resource.getFilename());
        try {
            System.out.println("" + resource.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
