package com.project.fanbase.api.service;

import java.util.List;

import com.project.fanbase.api.dto.AvatarDTO;

public interface AvatarService {
    AvatarDTO createAvatar(AvatarDTO avatarDTO);
    AvatarDTO getAvatarById(Long id);
    List<AvatarDTO> getAllAvatars();
    AvatarDTO updateAvatar(Long id, AvatarDTO avatarDTO);
    void deleteAvatar(Long id);
}
