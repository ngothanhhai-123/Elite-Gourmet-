package com.ngocquang.restautant.repository;


import com.ngocquang.restautant.Enity.resTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface resTableRepository extends JpaRepository<resTable,Integer> {
}
