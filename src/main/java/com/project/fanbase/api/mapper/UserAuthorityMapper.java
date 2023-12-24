package com.project.fanbase.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.project.fanbase.api.dto.UserAuthorityDTO;
import com.project.fanbase.api.entity.UserAuthority;
@Mapper(componentModel = "spring")
@Component
public interface UserAuthorityMapper {
    @Mapping(source = "id", target = "id")
    UserAuthorityDTO toDto(UserAuthority userAuthority);

    @Mapping(source = "id", target = "id")
    UserAuthority toEntity(UserAuthorityDTO userAuthorityDTO);
}
