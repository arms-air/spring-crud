package com.arms.asia.userscrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudAppApplication implements CommandLineRunner {
	
	@Autowired
	private CrudDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new CrudData("Mike"));
		repository.save(new CrudData("John"));
		repository.save(new CrudData("Bob"));
	}

}
