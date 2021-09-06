package model;

import java.util.ArrayList;

public class StudentData
{
	ArrayList<Student> students = new ArrayList<>();
	
	public void insertStudent(String name, String pass, String photo, String gender, String career, String browser, String birthdate)
	{
		Student newStudent = new Student(name, pass, photo, gender, career, browser, birthdate);
		students.add(newStudent);
	}
}
