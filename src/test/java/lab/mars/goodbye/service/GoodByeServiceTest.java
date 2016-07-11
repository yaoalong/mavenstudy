package lab.mars.goodbye.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Author: yeming
 * date: 2016/7/10 12:40
 */
public class GoodByeServiceTest {
    @Test
   public void testService(){
       GoodByeService goodByeService=new GoodByeService();
        Assert.assertEquals("good bye",goodByeService.goodBye());
   }
}
