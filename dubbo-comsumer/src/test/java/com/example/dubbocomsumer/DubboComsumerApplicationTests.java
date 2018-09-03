package com.example.dubbocomsumer;

import com.example.provider.service.ComputeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboComsumerApplicationTests {

    @Autowired
    ComputeService computeService;

    @Test
    public void testAdd() throws Exception {
        System.out.println("cn.ctoedu: Dubbo消费结果为：。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。"+computeService.add(100, 200));
        Assert.assertEquals("compute-service:add", new Integer(3), computeService.add(1, 2));
        //Assert.assertEquals("compute-service:add", new Integer(5), computeService.add(1, 2));
    }

}
