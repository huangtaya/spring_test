package com.imooc.beanannotation.jsr;

import com.imooc.base.UnitTestBase;
import org.junit.Test;

/** 
* JsrServie Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 20, 2018</pre> 
* @version 1.0 
*/ 
public class JsrServieTest extends UnitTestBase {
    public JsrServieTest() {
        super("classpath*:spring-beanannotation.xml");
    }
/** 
* 
* Method: setDao(JsrDAO dao) 
* 
*/ 
@Test
public void testSetDao() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: save() 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here...
    JsrServie bean = super.getBean("JsrServie");
    bean.save();
} 


} 
