package com.estudiocontable.profileservice.service.impl;

import com.estudiocontable.profileservice.dto.UserProfileDTO;
import com.estudiocontable.profileservice.model.UserProfile;
import com.estudiocontable.profileservice.repository.IUserProfileRepository;
import com.estudiocontable.profileservice.service.IUserProfileService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserProfileService implements IUserProfileService {

    private final IUserProfileRepository userProfileRepository;
    private final ObjectMapper objectMapper;
    @Autowired
    public UserProfileService(IUserProfileRepository userProfileRepository, ObjectMapper objectMapper) {
        this.userProfileRepository = userProfileRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public Set<UserProfileDTO> getUsers() {
        List<UserProfile> users = userProfileRepository.findAll();
        Set<UserProfileDTO> usersDTOS = users.stream()
                .map(user -> {
                    return new UserProfileDTO(user.getId(),user.getName(),user.getLastName(),user.getCuit(), user.getEmail(), user.getPhoneNumer());
                }).collect(Collectors.toSet());

        //LOGGER.info("Lista de todos los pacientes: {}", pacienteDtos);
        return usersDTOS;
    }

    @Override
    public UserProfileDTO findUserById() {
        return null;
    }

    @Override
    public UserProfileDTO saveUser(UserProfile user) {
        return null;
    }

    @Override
    public UserProfileDTO updateUser(UserProfile userProfile) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
