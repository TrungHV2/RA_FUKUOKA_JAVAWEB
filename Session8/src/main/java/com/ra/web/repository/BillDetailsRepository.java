package com.ra.web.repository;

import com.ra.web.entity.BillDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillDetailsRepository extends JpaRepository<BillDetailsEntity, Long> {
}
