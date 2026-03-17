package com.ngocquang.restautant.repository;

import com.ngocquang.restautant.Enity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
