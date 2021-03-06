package com.example.test.repository;

import com.example.test.TestApplicationTests;
import com.example.test.model.entity.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class ItemRepositoryTest extends TestApplicationTests {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){
        Item item =new Item();
        item.setName("노트북");
        item.setPrice(100000);
        item.setContent("samsung");

        Item newItem =itemRepository.save(item);
        Assert.assertNotNull(newItem);

    }
    @Test
    public void read(){
        Long id = 1L;
        Optional<Item> item = itemRepository.findById(id);

        item.ifPresent(i->{
            System.out.println(i);
        });
    }
}
