package com.practice.spring.Dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.practice.spring.Entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static{
		students = new HashMap<Integer, Student>(){
			{	
				put(1, new Student(1, "Charlie", "Programmer"));
				put(2, new Student(2, "Naomi", "Tester"));
				put(3, new Student(3, "Grelly", "DBA"));
			}
		};
	}	
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentById(int id){
		return this.students.get(id);
	}
}
