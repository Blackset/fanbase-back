package com.project.fanbase.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fanbase.api.dto.AvatarDTO;
import com.project.fanbase.api.entity.Avatar;
import com.project.fanbase.api.mapper.AvatarMapper;
import com.project.fanbase.api.repository.AvatarRepository;
import com.project.fanbase.api.service.AvatarService;

@Service
public class AvatarServiceImpl implements AvatarService {
    @Autowired
    private AvatarRepository avatarRepository;

    @Autowired
    private AvatarMapper avatarMapper;
    @Override
    public AvatarDTO createAvatar(AvatarDTO avatarDTO) {
        Avatar avatar = avatarMapper.toEntity(avatarDTO);
        Avatar savedAvatar = avatarRepository.save(avatar);
        return avatarMapper.toDto(savedAvatar);
    }

    @Override
    public AvatarDTO getAvatarById(Long id) {
        Optional<Avatar> avatarOptional = avatarRepository.findById(id);
        if (avatarOptional.isPresent()) {
            return avatarMapper.toDto(avatarOptional.get());
        }
        return null;
    }

    @Override
    public List<AvatarDTO> getAllAvatars() {
        List<Avatar> avatarList = avatarRepository.findAll();
        return avatarList.stream()
                .map(avatar -> avatarMapper.toDto(avatar))
                .collect(Collectors.toList());
    }

    @Override
    public AvatarDTO updateAvatar(Long id, AvatarDTO avatarDTO) {
        if (avatarRepository.existsById(id)) {
            Avatar avatar = avatarMapper.toEntity(avatarDTO);
            Avatar updatedAvatar = avatarRepository.save(avatar);
            return avatarMapper.toDto(updatedAvatar);
        }
        return null;
    }

    @Override
    public void deleteAvatar(Long id) {
        avatarRepository.deleteById(id);
    }
}
