package com.example.stoplight.service;

import com.example.stoplight.model.UserDao;
import com.example.stoplight.repository.UserDaoRepository;
import com.examples.apifirst.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserDaoRepository userDaoRepository;

  public void saveUser(User user) {
    UserDao userDao = new UserDao();
    userDao.setFirstName(user.getFirstName());
    userDao.setLastName(user.getLastName());
    userDao.setEmailVerified(user.getEmailVerified());
    userDao.setEmail(user.getEmail());
    userDaoRepository.save(userDao);
  }
}
