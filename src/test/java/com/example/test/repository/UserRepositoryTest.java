package com.example.test.repository;


import com.example.test.TestApplicationTests;
import com.example.test.model.entity.User;
import com.example.test.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends TestApplicationTests {

    @Autowired
    private UserRepository ur;

    @Test
    public void create(){
        //insert into () values() 를 자동으로 매핑
        User user = new User();
        user.setAccount("testAccount2");
        user.setEmail("test@naver.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser=ur.save(user);
        System.out.println("newUser:"+ newUser);
    }
    @Test
    public void read(){
        //read 는 find 와 관련되어있음
        //id type long 에 2가 있다면~~
        //후에 매개변수추가로 검색 방법 변경 가
        Optional<User> user =ur.findById(2L);

        user.ifPresent(selectUser ->{
            System.out.println("user : " +selectUser);
            System.out.println("email : "+selectUser.getEmail());
        });
    }
    @Test
    public void update(){
        Optional<User> user =ur.findById(2L);
        user.ifPresent(selectUser ->{
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("updated method");

            ur.save(selectUser);

                 });

    }
    @Test
    public void delete(){
        Optional<User> user =ur.findById(2L);
        user.ifPresent(selectUser ->{
            ur.delete(selectUser);
            System.out.println("데이터 제거 성공");
                 });

    }
}

