package com.project.fanbase.api.service.impl;

import java.util.List;

import com.project.fanbase.api.entity.Artwork;
import com.project.fanbase.api.repository.ArtworkRepository;
import com.project.fanbase.api.service.ArtworkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ArtworkServiceImpl implements ArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository; // Assuming you have a repository interface

    @Override
    public Artwork createArtwork(Artwork artwork) {
        // Add any additional business logic or validation here
        return artworkRepository.save(artwork);
    }

    @Override
    public Artwork getArtworkById(Long id) {
        // Add error handling or additional logic if needed
        return artworkRepository.findById(id).orElse(null);
    }

    @Override
    public List<Artwork> getAllArtwork() {
        // Add additional logic or filtering if needed
        return artworkRepository.findAll();
    }

    @Override
    public Artwork updateArtwork(Long id, Artwork artwork) {
        // Add error handling or additional logic if needed
        if (artworkRepository.existsById(id)) {
            return artworkRepository.save(artwork);
        }
        return null; // Return null if the artwork with the given ID doesn't exist
    }

    @Override
    public void deleteArtwork(Long id) {
        // Add error handling or additional logic if needed
        artworkRepository.deleteById(id);
    }
}

