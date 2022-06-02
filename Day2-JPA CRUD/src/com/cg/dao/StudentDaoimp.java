package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class StudentDaoimp implements StudentDeo{
	private EntityManager entityManager;
	
	public StudentDaoimp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
		
	}

	@Override
	public Student updateStudent(Student student) {
		return entityManager.merge(student);
		
	}

	@Override
	public Student removeStudent(Student student) {
		entityManager.remove(student);
		return student;
	}

	@Override
	public void begainTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
