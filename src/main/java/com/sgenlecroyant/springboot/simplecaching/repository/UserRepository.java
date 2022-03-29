package com.sgenlecroyant.springboot.simplecaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgenlecroyant.springboot.simplecaching.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
