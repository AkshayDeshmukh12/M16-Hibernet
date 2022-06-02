package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDeo {
	public abstract Student getStudentById(int id);
	public abstract Student addStudent(Student student); 
	public abstract Student updateStudent(Student student);
	public abstract Student removeStudent(Student student);
	public abstract void begainTransaction();
	public abstract void commitTransaction();
	
}
