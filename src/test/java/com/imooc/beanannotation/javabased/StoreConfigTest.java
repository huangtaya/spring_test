package com.imooc.beanannotation.javabased;

import com.imooc.base.UnitTestBase;
import org.junit.Test;

/** 
* StoreConfig Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 18, 2018</pre> 
* @version 1.0 
*/ 
public class StoreConfigTest extends UnitTestBase {

    public StoreConfigTest() {
        super("classpath:spring-beanannotation.xml");
    }

/** 
* 
* Method: stringStore() 
* 
*/ 
@Test
public void testStringStore() throws Exception { 
    Store test1 = super.getBean("stringStore");
    System.out.println("test1 name:"+ test1.getClass().getName());

    MyDriverManager test2 = super.getBean("myDriverManager");
}

@Test
public void testStringStoreTest() {
    Store bean = super.getBean("stringStoreTest");
}


} 
