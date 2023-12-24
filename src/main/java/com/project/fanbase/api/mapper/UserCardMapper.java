package com.project.fanbase.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.project.fanbase.api.dto.UserCardDTO;
import com.project.fanbase.api.entity.UserCard;

@Mapper(componentModel = "spring")
@Component
public interface UserCardMapper {
    @Mapping(source = "id", target = "id")
    UserCardDTO toDto(UserCard userCard);

    @Mapping(source = "id", target = "id")
    UserCard toEntity(UserCardDTO userCardDTO);
}
