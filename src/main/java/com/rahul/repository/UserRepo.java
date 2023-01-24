package com.rahul.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.entity.UserInfo;

public interface UserRepo  extends JpaRepository< UserInfo, Integer>{

	Optional<UserInfo> findByName(String username);

}
