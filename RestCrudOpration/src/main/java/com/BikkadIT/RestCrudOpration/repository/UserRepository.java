package com.BikkadIT.RestCrudOpration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RestCrudOpration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
