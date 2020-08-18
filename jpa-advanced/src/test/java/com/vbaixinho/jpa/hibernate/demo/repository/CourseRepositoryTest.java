package com.vbaixinho.jpa.hibernate.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.vbaixinho.jpa.hibernate.demo.DemoApplication;
import com.vbaixinho.jpa.hibernate.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)	
class CourseRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	CourseRepository repository;
	
	@Test
	void findById_basic() {
		Course course = repository.findById(10002L);
		assertEquals("vbaixinho2", course.getName());
	}

	@Test
	@DirtiesContext //permite que o deletedo neste teste seja encontrado no teste find 
	void deleteById_basic() {
		repository.deleteById(10002L);
		assertNull(repository.findById(10002L));
	}

	@Test
	@DirtiesContext //permite que o deletedo neste teste seja encontrado no teste find 
	void save_basic() {
//		get a course
		Course course = repository.findById(10001L);
		assertEquals("vbaixinho1", course.getName());
	
//		update details
		course.setName("vbaixinho11");
		repository.save(course);
		
//		check the value
		Course course1 = repository.findById(10001L);
		assertEquals("vbaixinho11", course1.getName());
		
	}

	@Test
	@DirtiesContext //permite que o deletedo neste teste seja encontrado no teste find 
	void playingWithEntityManager() {

		repository.playingWithEntityManager();
	}
}
