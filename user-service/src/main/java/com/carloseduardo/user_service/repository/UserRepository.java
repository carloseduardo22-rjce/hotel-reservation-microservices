package com.carloseduardo.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloseduardo.user_service.entitie.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
