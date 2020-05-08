package com.vbaixinho.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vbaixinho.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", repository.findById(10001));
//		logger.info("Deleting user 10002 -> number of rows deleted - {}", dao.deleteById(10002));
//		logger.info("Inserting user 10005 -> {}", dao.insertPerson(new Person(10005,"vitor6","lisboa6", new Date())));
//		logger.info("Updating user 10003 -> {}", dao.updatePerson(new Person(10003,"vitor33","lisboa3", new Date())));
//		
	}

}
