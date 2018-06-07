package com.imooc.autowiring;

import com.imooc.base.UnitTestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AutoWiringService Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 7, 2018</pre> 
* @version 1.0 
*/ 
public class AutoWiringServiceTest extends UnitTestBase {

    public AutoWiringServiceTest(){
        super("classpath:spring-autowiring.xml");
    }
/** 
* 
* Method: say(String word) 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    AutoWiringService bean1 = super.getBean("autoWiringService");
    bean1.say("constructor");
} 


} 
