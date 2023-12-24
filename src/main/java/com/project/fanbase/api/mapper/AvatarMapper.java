package com.project.fanbase.api.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.project.fanbase.api.dto.AvatarDTO;
import com.project.fanbase.api.entity.Avatar;

@Mapper(componentModel = "spring")
@Component
public interface AvatarMapper {

    AvatarDTO toDto(Avatar avatar);


    Avatar toEntity(AvatarDTO avatarDTO);
}
