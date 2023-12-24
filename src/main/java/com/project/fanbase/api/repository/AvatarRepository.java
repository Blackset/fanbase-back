package com.project.fanbase.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fanbase.api.entity.Avatar;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    // You can define custom query methods here if needed
}

