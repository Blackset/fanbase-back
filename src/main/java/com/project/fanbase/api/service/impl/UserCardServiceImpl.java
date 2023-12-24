package com.project.fanbase.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fanbase.api.dto.UserCardDTO;
import com.project.fanbase.api.entity.UserCard;
import com.project.fanbase.api.mapper.UserCardMapper;
import com.project.fanbase.api.repository.UserCardRepository;
import com.project.fanbase.api.service.UserCardService;

@Service
public class UserCardServiceImpl implements UserCardService {
    @Autowired
    private UserCardRepository userCardRepository;

    @Autowired
    private UserCardMapper userCardMapper;
            // You can use a mapping library like ModelMapper to convert between entities and DTOs

    @Override
    public UserCardDTO createUserCard(UserCardDTO userCardDTO) {
        UserCard userCard = userCardMapper.toEntity(userCardDTO);
        UserCard savedUserCard = userCardRepository.save(userCard);
        return userCardMapper.toDto(savedUserCard);
    }

    @Override
    public UserCardDTO getUserCardById(Long id) {
        Optional<UserCard> userCardOptional = userCardRepository.findById(id);
        if (userCardOptional.isPresent()) {
            return userCardMapper.toDto(userCardOptional.get());
        }
        return null;

    }

    @Override
    public List<UserCardDTO> getAllUserCards() {
        List<UserCard> userCardList = userCardRepository.findAll();
        return userCardList.stream()
                .map(userCard -> userCardMapper.toDto(userCard))
                .collect(Collectors.toList());
    }

    @Override
    public UserCardDTO updateUserCard(Long id, UserCardDTO userCardDTO) {
        if (userCardRepository.existsById(id)) {
            UserCard userCard = userCardMapper.toEntity(userCardDTO);

            UserCard updatedUserCard = userCardRepository.save(userCard);
            return userCardMapper.toDto(updatedUserCard);
        }
        return null;
    }

    @Override
    public void deleteUserCard(Long id) {
        userCardRepository.deleteById(id);
    }
}
