package com.imooc.bean;

import com.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BeanScope Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 2, 2018</pre> 
* @version 1.0 
*/ 
public class BeanScopeTest extends UnitTestBase {

/** 
* 
* Method: say() 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    BeanScope bean1 = super.getBean("beanScope");
    bean1.say();
} 


} 
