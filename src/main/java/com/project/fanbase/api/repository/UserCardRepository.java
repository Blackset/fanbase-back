package com.project.fanbase.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fanbase.api.entity.UserCard;

@Repository
public interface UserCardRepository extends JpaRepository<UserCard, Long> {
    // You can define custom query methods here if needed
}



