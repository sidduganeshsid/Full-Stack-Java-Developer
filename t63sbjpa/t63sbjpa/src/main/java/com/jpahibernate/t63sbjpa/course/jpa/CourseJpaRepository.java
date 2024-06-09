package com.jpahibernate.t63sbjpa.course.jpa;

import org.springframework.stereotype.Repository;

import com.jpahibernate.t63sbjpa.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	@PersistenceContext //@Autowired
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	

}
