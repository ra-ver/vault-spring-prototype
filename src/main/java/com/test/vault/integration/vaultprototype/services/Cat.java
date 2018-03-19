package com.test.vault.integration.vaultprototype.services;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
@ToString
public class Cat {

  @Value("${cat.name}")
  private String name;
  @Value("${cat.age}")
  private String age;

}
