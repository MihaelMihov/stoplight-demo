package com.example.stoplight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserDao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private boolean isEmailVerified;
}
