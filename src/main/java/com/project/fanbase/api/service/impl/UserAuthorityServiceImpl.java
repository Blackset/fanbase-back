package com.project.fanbase.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.fanbase.api.dto.UserAuthorityDTO;
import com.project.fanbase.api.entity.UserAuthority;
import com.project.fanbase.api.mapper.UserAuthorityMapper;
import com.project.fanbase.api.repository.UserAuthorityRepository;
import com.project.fanbase.api.service.UserAuthorityService;

@Service
@Transactional
public class UserAuthorityServiceImpl implements UserAuthorityService {
    @Autowired
    private UserAuthorityRepository userAuthorityRepository;

    @Autowired
    private UserAuthorityMapper userAuthorityMapper;

    @Override
    public UserAuthorityDTO createUserAuthority(UserAuthorityDTO userAuthorityDTO) {
        UserAuthority userAuthority = userAuthorityMapper.toEntity(userAuthorityDTO);
        UserAuthority savedUserAuthority = userAuthorityRepository.save(userAuthority);
        return userAuthorityMapper.toDto(savedUserAuthority);
    }

    @Override
    public UserAuthorityDTO getUserAuthorityById(Long id) {
        Optional<UserAuthority> userAuthorityOptional = userAuthorityRepository.findById(id);
        if (userAuthorityOptional.isPresent()) {
            return userAuthorityMapper.toDto(userAuthorityOptional.get());
        }
        return null;
    }

    @Override
    public List<UserAuthorityDTO> getAllUserAuthorities() {
        List<UserAuthority> userAuthorityList = userAuthorityRepository.findAll();
        return userAuthorityList.stream()
                .map(userAuthority -> userAuthorityMapper.toDto(userAuthority))
                .collect(Collectors.toList());
    }

    @Override
    public UserAuthorityDTO updateUserAuthority(Long id, UserAuthorityDTO userAuthorityDTO) {
        if (userAuthorityRepository.existsById(id)) {
            UserAuthority userAuthority = userAuthorityMapper.toEntity(userAuthorityDTO);
            UserAuthority updatedUserAuthority = userAuthorityRepository.save(userAuthority);
            return userAuthorityMapper.toDto(updatedUserAuthority);
        }
        return null;
    }

    @Override
    public void deleteUserAuthority(Long id) {
        userAuthorityRepository.deleteById(id);
    }
}