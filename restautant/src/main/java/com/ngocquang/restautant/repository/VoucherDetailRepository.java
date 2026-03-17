package com.ngocquang.restautant.repository;


import com.ngocquang.restautant.Enity.VoucherDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherDetailRepository extends JpaRepository<VoucherDetail,Integer> {
}
