package lab.mars.helloworld.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Author: yeming
 * date: 2016/7/10 12:40
 */
public class HelloWorldServiceTest {
    @Test
    public void serviceTest() {
     HelloWorldService helloWorldService=new HelloWorldService();
        Assert.assertEquals("HelloWorld",helloWorldService.service());
    }
}
