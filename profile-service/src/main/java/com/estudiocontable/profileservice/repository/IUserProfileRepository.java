package com.estudiocontable.profileservice.repository;

import com.estudiocontable.profileservice.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserProfileRepository extends JpaRepository<UserProfile,Long> {

}
