package com.example.smartphonestore.repositories;

import com.example.smartphonestore.entities.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
}
