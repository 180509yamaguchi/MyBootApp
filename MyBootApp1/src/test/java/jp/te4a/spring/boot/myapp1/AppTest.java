 package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void indexTest()
    {
        HelloController controller = new HelloController();
        assertEquals("Hello, Spring Boot!", controller.index());
    }
}