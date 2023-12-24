package com.project.fanbase.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.fanbase.api.entity.Artwork;
import com.project.fanbase.api.service.ArtworkService;

@RestController
@RequestMapping("/artwork")
public class ArtworkController {
    @Autowired
    private ArtworkService artworkService;

    // Create a new artwork
    @PostMapping("/")
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return artworkService.createArtwork(artwork);
    }

    // Retrieve artwork by ID
    @GetMapping("/{id}")
    public Artwork getArtworkById(@PathVariable Long id) {
        return artworkService.getArtworkById(id);
    }

    // Update an existing artwork
    @PutMapping("/{id}")
    public Artwork updateArtwork(@PathVariable Long id, @RequestBody Artwork artwork) {
        return artworkService.updateArtwork(id, artwork);
    }

    // Delete an artwork by ID
    @DeleteMapping("/{id}")
    public void deleteArtwork(@PathVariable Long id) {
        artworkService.deleteArtwork(id);
    }
}
