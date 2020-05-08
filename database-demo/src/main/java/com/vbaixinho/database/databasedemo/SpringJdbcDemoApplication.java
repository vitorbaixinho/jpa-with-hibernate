package com.vbaixinho.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vbaixinho.database.databasedemo.entity.Person;
import com.vbaixinho.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		logger.info("Deleting user 10002 -> number of rows deleted - {}", dao.deleteById(10002));
		logger.info("Inserting user 10005 -> {}", dao.insertPerson(new Person(10005,"vitor6","lisboa6", new Date())));
		logger.info("Updating user 10003 -> {}", dao.updatePerson(new Person(10003,"vitor33","lisboa3", new Date())));
		
	}

}
