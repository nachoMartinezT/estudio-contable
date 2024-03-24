package com.estudiocontable.profileservice.service;


import com.estudiocontable.profileservice.dto.UserProfileDTO;
import com.estudiocontable.profileservice.model.UserProfile;

import java.util.Set;

public interface IUserProfileService {

    Set<UserProfileDTO> getUsers();

    UserProfileDTO findUserById();

    UserProfileDTO saveUser(UserProfile user);

    UserProfileDTO updateUser(UserProfile userProfile);

    void deleteUser(Long id);


}
