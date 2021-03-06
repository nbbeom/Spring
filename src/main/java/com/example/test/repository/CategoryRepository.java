package com.example.test.repository;

import com.example.test.model.entity.Category;
import com.example.test.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByType(String type);
}
