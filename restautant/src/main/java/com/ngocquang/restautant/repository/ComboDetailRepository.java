package com.ngocquang.restautant.repository;


import com.ngocquang.restautant.Enity.ComboDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboDetailRepository extends JpaRepository<ComboDetail,Integer> {
}
