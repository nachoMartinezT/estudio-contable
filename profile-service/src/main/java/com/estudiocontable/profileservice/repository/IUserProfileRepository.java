package com.estudiocontable.profileservice.repository;

import com.estudiocontable.profileservice.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserProfileRepository extends JpaRepository<UserProfile,Long> {
}
