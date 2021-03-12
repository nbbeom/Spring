package com.example.test.repository;

import com.example.test.TestApplicationTests;
import com.example.test.model.entity.Category;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class CategoryRepositoryTest extends TestApplicationTests {

    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    public void create(){
        String Type = "COMPUTER";
        String title = "컴퓨터";
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy ="AdminServer";

        Category cate = new Category();
        cate.setType(Type);
        cate.setCreatedAt(createdAt);
        cate.setCreatedBy(createdBy);
        cate.setTitle(title);

        Category newCategory= categoryRepository.save(cate);
        Assert.assertNotNull(newCategory);
        Assert.assertEquals(newCategory.getType(),Type);
        Assert.assertEquals(newCategory.getTitle(),title);
    }
    @Test
    public void read(){
        Optional<Category> optionalCategory = categoryRepository.findByType("COMPUTER");
        //select * from category where type ="computer"
        optionalCategory.ifPresent(c->{
            System.out.println(c.getId());
            System.out.println(c.getTitle());
        });
    }
}
