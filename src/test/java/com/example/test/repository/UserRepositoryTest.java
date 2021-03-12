package com.example.test.repository;


import com.example.test.TestApplicationTests;
import com.example.test.model.entity.User;
import com.example.test.model.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends TestApplicationTests {

    @Autowired
    private UserRepository ur;

    @Test
    public void create(){
        String account  ="Test01";
        String password = "Test01";
        String status = "REGISTRED";
        String email = "Test@kpu.ac.kr";
        String phoneNumber = "010-0000-000";
        LocalDateTime registeredAt  =LocalDateTime.now();
        LocalDateTime crreateAt = LocalDateTime.now();
        String createdBy = "AdminServer";

        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(crreateAt);
        user.setCreatedBy(createdBy);

        User newUser = ur.save(user);
        Assert.assertNotNull(newUser);
    }
    @Test
    @Transactional
    public void read(){

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

