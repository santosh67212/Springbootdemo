package com.zensar.spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.spring.entity.User;

@Repository
public interface UserRepository extends JpaRepoository<User, Integer> {
	List<User> findByUserName(String userName);

}
