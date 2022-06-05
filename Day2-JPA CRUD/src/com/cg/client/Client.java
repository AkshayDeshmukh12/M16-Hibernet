package com.cg.client;

import com.cg.entities.Student;
import com.cg.services.StudentService;
import com.cg.services.StudentServiceImp1;

public class Client {

	public static void main(String[] args) {
		StudentService obj=new StudentServiceImp1();
		Student student=new Student();
		
		student.setStudentId(103);
		student.setName("Amol");
		obj.addStudent(student);
		
		student =obj.findStudentById(101);
		System.out.println("Student id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getName());
		
		student = obj.findStudentById(101);
		student.setName("Akshay Deshmukh");
		obj.updateStudent(student);
		
	}

}
