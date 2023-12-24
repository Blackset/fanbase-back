package com.project.fanbase.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.fanbase.api.entity.Artwork;

@Service
@Transactional
public interface ArtworkService {
    Artwork createArtwork(Artwork artwork);

    Artwork getArtworkById(Long id);

    List<Artwork> getAllArtwork();

    Artwork updateArtwork(Long id, Artwork artwork);

    void deleteArtwork(Long id);
}
