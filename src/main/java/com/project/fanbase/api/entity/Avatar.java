package com.project.fanbase.api.entity;

public record Avatar(Long id,
                     String surname,
                     String name,
                     String description,
                     String image,
                     UserCard creator,
                     Artwork art) {

}

