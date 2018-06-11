package com.imooc.resource;

import com.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MoocResource Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 11, 2018</pre> 
* @version 1.0 
*/ 
public class MoocResourceTest extends UnitTestBase {

    public MoocResourceTest() {
        super("classpath:spring-resource.xml");
    }

    /**
* 
* Method: setApplicationContext(ApplicationContext applicationContext) 
* 
*/ 
@Test
public void testSetApplicationContext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: resource() 
* 
*/ 
@Test
public void testResource() throws Exception { 
//TODO: Test goes here...
    MoocResource mooc = super.getBean("moocResource");
    mooc.resource();

} 


} 
