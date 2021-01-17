package javaFirstAssessment;
import java.util.ArrayList;

public class Student extends Person{ //create class Student inherite from class Person
	private int numCourses;
	private ArrayList<String> courses = new ArrayList<String>();
	private ArrayList<Integer> grades = new ArrayList<Integer>();
	
	public Student(String name, String address) {
		super(name,address);//call constructor of superclass
	}
	
	public void addCourseGrade(String course, int grade) {
		courses.add(course); //add to course ArrayList
		grades.add(grade); //add to grade ArrayList
	}
	
	public void printGrades() {
		int i;
		System.out.println("Courses \t Grades"); //print label
		for(i=0; i<this.courses.size(); i++) {
			System.out.println(this.courses.get(i)+" \t \t"+this.grades.get(i)); //each iteration print i-th courses element and grade element
		}
	}
	
	public double getAverageGrade() {
		int i=0;
		double sum=0,average;
		
		for(i=0; i<this.grades.size();i++) {
			sum+=this.grades.get(i); //each iteration add element of grades to sum then save to sum again
		}
		average = sum/this.grades.size(); //find the avarage
		return average;
	}
	
	public String getStatus() {
		return "Student";
	}
}