package com.vbaixinho.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vbaixinho.jpa.hibernate.demo.entity.Course;

@Repository
@Transactional
public class CourseRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());	
	
	@Autowired
	EntityManager em;

	public Course findById(long id) {

		return em.find(Course.class, id);
	}

	public void deleteById(long id) {

		Course course = findById(id);
		em.remove(course);
	}

	public void save(Course course) {
		
		if (findById(course.getId()) == null) {
			em.persist(course);
		}
		else {
			em.merge(course);
		}
	}
	
	public void playingWithEntityManager() {
		
		logger.info("playingWithEntityManager - start");
		
		Course course1 = new Course("vbaixinho - playing 1");
		em.persist(course1);
		Course course2 = new Course("vbaixinho - playing 2");
		em.persist(course2);
		em.flush();

//		em.detach(course2);
//		em.clear();	
		
		em.refresh(course1);
		
		course1.setName("vbaixinho - playing 1 - updated");	
		course2.setName("vbaixinho - playing 2 - updated");
		em.flush();
	}

}
