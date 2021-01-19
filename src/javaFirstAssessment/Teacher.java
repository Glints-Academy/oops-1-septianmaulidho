package javaFirstAssessment;

import java.util.ArrayList;

public class Teacher extends Person{
	private int numCourses;
	private ArrayList<String> courses = new ArrayList<String>();
	
	public Teacher(String name,String address) {
		super(name,address);
	}
	
	public boolean addCourse(String course) {
		boolean isExist = this.courses.contains(course);
		if(isExist) {
			System.out.println("dalm if");
			return isExist;
			
		}
		this.courses.add(course);
		return true;
	}
	
	public boolean removeCourse(String course) {
		boolean isExist = true;
		isExist = this.courses.contains(course);
		if(!isExist) {
			return false;
		}
		int index = this.courses.indexOf(course);
		this.courses.remove(index);
		return isExist;
	}
	public String getStatus() {
		return "Teacher";
	}
}
