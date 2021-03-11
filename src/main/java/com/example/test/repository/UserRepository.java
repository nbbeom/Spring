package com.example.test.repository;

import com.example.test.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    //select * from user where account =? << test03 or 04
    Optional<User> findByAccount(String account);

    Optional<User> findByEmail(String email);


}
