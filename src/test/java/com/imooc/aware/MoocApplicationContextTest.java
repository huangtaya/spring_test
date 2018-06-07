package com.imooc.aware;

import com.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MoocApplicationContext Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 5, 2018</pre> 
* @version 1.0 
*/ 
public class MoocApplicationContextTest extends UnitTestBase{

/** 
* 
* Method: setApplicationContext(ApplicationContext applicationContext) 
* 
*/ 
@Test
public void testSetApplicationContext() throws Exception { 
//TODO: Test goes here...
    System.out.println("222222");
    System.out.println("testSetApplicationContext : " + super.getBean("moocApplicationContext").hashCode());
} 


} 
