package com.test.vault.integration.vaultprototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/*
	Added spring-cloud-vault dependency: https://github.com/spring-cloud/spring-cloud-vault
	Followed hello-world example here: https://github.com/mp911de/spring-cloud-vault-config-samples/tree/master/spring-cloud-vault/hello-world
 */
@SpringBootApplication
public class VaultPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaultPrototypeApplication.class, args);
	}

	@Value("${mykey}")
	String mykey;

	@Value("${hello.world}")
	String helloWorld;

	@PostConstruct
	private void postConstruct() {
		System.out.println("##########################");
		System.out.println(mykey);
		System.out.println(helloWorld);
		System.out.println("##########################");
	}
}