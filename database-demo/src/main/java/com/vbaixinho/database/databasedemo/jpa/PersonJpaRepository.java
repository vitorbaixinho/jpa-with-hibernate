package com.vbaixinho.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vbaixinho.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

//	conection to database
	@PersistenceContext
	EntityManager entityManager;

	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person updatePerson(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insertPerson(Person person) {
		return entityManager.merge(person);
	}
	
	public void deletePerson(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}
}
