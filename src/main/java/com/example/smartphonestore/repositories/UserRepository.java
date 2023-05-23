package com.example.smartphonestore.repositories;

import com.example.smartphonestore.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
