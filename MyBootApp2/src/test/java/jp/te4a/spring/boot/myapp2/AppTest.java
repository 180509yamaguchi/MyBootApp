package jp.te4a.spring.boot.myapp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyBootApp2ApplicationTests {

    @Test
    void taroTest() {
        HelloController2 controller = new HelloController2();
        assertEquals("Taro desu!", controller.index());
    }
}