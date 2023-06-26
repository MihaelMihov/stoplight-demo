package com.example.stoplight.repository;

import com.example.stoplight.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDaoRepository extends JpaRepository<UserDao, Long> {

}
