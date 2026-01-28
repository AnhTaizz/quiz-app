package com.app.quiz_app_demo.repository;

import com.app.quiz_app_demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByParent_CategoryID(Long parentID);
}
