package com.imooc.injection.service;

import com.imooc.base.UnitTestBase;
import org.junit.Test;

/** 
* InjectionServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 3, 2018</pre> 
* @version 1.0 
*/
public class InjectionServiceImplTest extends UnitTestBase {

/** 
* 
* Method: save(String arg) 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here...
    InjectionServiceImpl tmp = super.getBean("injectionService");
    tmp.save("hello");
}

/** 
* 
* Method: setInjectionDAO(InjectionDAO injectionDAO) 
* 
*/ 
@Test
public void testSetInjectionDAO() throws Exception { 
//TODO: Test goes here... 
} 


} 
