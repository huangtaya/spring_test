package com.imooc.beanannotation.multibean;

import com.imooc.base.UnitTestBase;
import org.junit.Test;

/** 
* BeanInvoker Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 14, 2018</pre> 
* @version 1.0 
*/ 
public class BeanInvokerTest extends UnitTestBase {
    public BeanInvokerTest() {
        super("classpath:spring-beanannotation.xml");
    }
/** 
* 
* Method: say() 
* 
*/ 
@Test
public void testSay() throws Exception { 
//TODO: Test goes here...
    BeanInvoker bean = super.getBean("beanInvoker");
    bean.say();
} 


} 
