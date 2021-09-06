package model;


public class Student
{
	// Attributes
	private String username, password, photoPath, gender, career, browser, birthdate;
	
	// Builder
	
	public Student(String name, String pass, String photo, String gender, String career, String browser, String birthdate)
	{
		this.username = name;
		this.password = pass;
		this.photoPath = photo;
		this.gender = gender;
		this.career = career;
		this.browser = browser;
		this.birthdate = birthdate;
	}
	
	
}
