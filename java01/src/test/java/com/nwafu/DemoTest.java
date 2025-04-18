package com.nwafu;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String s = d.say("zhangsan");
        Assert.assertEquals("hellozhangsan", s);
    }
}
