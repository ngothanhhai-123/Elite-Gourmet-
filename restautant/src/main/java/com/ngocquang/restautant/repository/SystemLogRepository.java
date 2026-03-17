package com.ngocquang.restautant.repository;


import com.ngocquang.restautant.Enity.SystemLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SystemLogRepository extends JpaRepository<SystemLog,Integer> {
}
