package com.project.fanbase.api.mapper;

import org.mapstruct.Mapper;

import com.project.fanbase.api.dto.ArtworkDTO;
import com.project.fanbase.api.entity.Artwork;
@Mapper(componentModel = "spring")
public interface ArtworkMapper {

    ArtworkDTO toDto(Artwork artwork);


    Artwork toEntity(ArtworkDTO artworkDTO);
}
