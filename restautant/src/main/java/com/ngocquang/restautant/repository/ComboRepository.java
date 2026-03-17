package com.ngocquang.restautant.repository;


import com.ngocquang.restautant.Enity.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends JpaRepository<Combo,Integer> {
}
