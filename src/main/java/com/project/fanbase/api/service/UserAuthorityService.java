package com.project.fanbase.api.service;

import java.util.List;

import com.project.fanbase.api.dto.UserAuthorityDTO;

public interface UserAuthorityService {
    UserAuthorityDTO createUserAuthority(UserAuthorityDTO userAuthorityDTO);
    UserAuthorityDTO getUserAuthorityById(Long id);
    List<UserAuthorityDTO> getAllUserAuthorities();
    UserAuthorityDTO updateUserAuthority(Long id, UserAuthorityDTO userAuthorityDTO);
    void deleteUserAuthority(Long id);
}
