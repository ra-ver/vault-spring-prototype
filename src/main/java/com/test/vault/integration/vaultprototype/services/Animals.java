package com.test.vault.integration.vaultprototype.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Animals {

  @Autowired
  Dog dog;
  @Autowired
  Cat cat;

  @PostConstruct
  private void init(){
    System.out.println("Our pets are:");
    System.out.println(dog);
    System.out.println(cat);


  }

}
