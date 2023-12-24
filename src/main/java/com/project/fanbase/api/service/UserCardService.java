package com.project.fanbase.api.service;

import java.util.List;

import com.project.fanbase.api.dto.UserCardDTO;

public interface UserCardService {
    UserCardDTO createUserCard(UserCardDTO userCardDTO);
    UserCardDTO getUserCardById(Long id);
    List<UserCardDTO> getAllUserCards();
    UserCardDTO updateUserCard(Long id, UserCardDTO userCardDTO);
    void deleteUserCard(Long id);
}
