package com.project.fanbase.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fanbase.api.entity.Artwork;
@Repository
public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
    // You can define custom query methods here if needed
}

