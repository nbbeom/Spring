package com.example.test.repository;

import com.example.test.TestApplicationTests;
import com.example.test.model.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.time.LocalDateTime;

public class OrderDetailRepositoryTest  extends TestApplicationTests {

    @Autowired
    private OrderDetailRepository odr;

    @Test
    public void create(){
        OrderDetail od = new OrderDetail();
        od.setOrderAt(LocalDateTime.now());
        //어떤사람
        //od.setUserId(1L);
        //어떤상품?
        //od.setItemId(1L);
        OrderDetail od1 = odr.save(od);
        Assert.assertNotNull(od1);
    }
}
