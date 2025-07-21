package com.udemy.jpa.repositories;

import com.udemy.jpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
