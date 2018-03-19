package com.test.vault.integration.vaultprototype.services;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@Data
@ToString
public class Dog {

  @Value("${dog.name}")
  private String name;
  @Value("${dog.age}")
  private String age;

}
