package com.mbavellar.springbootmongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mbavellar.springbootmongodb.domain.User;
import com.mbavellar.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  @Autowired
  private UserService service;

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<User>> findAll() {
    return ResponseEntity.ok().body(service.findAll());
  }
}
