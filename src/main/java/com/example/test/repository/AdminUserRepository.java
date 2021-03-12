package com.example.test.repository;

import com.example.test.model.entity.AdminUser;
import com.example.test.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminUserRepository extends JpaRepository<AdminUser,Long> {
}
