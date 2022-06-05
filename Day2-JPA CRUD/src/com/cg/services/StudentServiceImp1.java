package com.cg.services;

import com.cg.dao.StudentDaoimp;
import com.cg.dao.StudentDeo;

import com.cg.entities.Student;

public class StudentServiceImp1 implements StudentService{
	private StudentDeo dao;
	
	public StudentServiceImp1() {
		dao=new StudentDaoimp();
	}

	@Override
	public void addStudent(Student student) {
		dao.begainTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById(int id) {
		Student student=dao.getStudentById(id);
		return student;
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.begainTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.begainTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

}
