package com.imooc.beanannotation;

import com.imooc.base.UnitTestBase;
import org.junit.Test;

/** 
* BeanAnnotation Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 12, 2018</pre> 
* @version 1.0 
*/ 
public class BeanAnnotationTest extends UnitTestBase {

    public BeanAnnotationTest() {
        super("classpath:spring-beanannotation.xml");
    }
/** 
* 
* Method: say(String arg) 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    BeanAnnotation bean = super.getBean("beanAnnotation");
    bean.say("hello");
} 

/** 
* 
* Method: myHashCode() 
* 
*/ 
@Test
public void testMyHashCode() throws Exception { 
//TODO: Test goes here...
    BeanAnnotation bean1 = super.getBean("beanAnnotation");
    bean1.myHashCode();

    BeanAnnotation bean2 = super.getBean("beanAnnotation");
    bean2.myHashCode();
} 


} 
