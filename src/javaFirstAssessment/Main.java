package javaFirstAssessment;

public class Main {
	
	public static void main(String[] args) {
		Teacher ani = new Teacher("Ani S","Medan");
		System.out.println(ani.toString());
		if(ani.addCourse("math")) System.out.println("math is added");
		else System.out.println("data is exist");
		if(ani.addCourse("sport")) System.out.println("sport is added");
		else System.out.println("data is exist");
		if(ani.removeCourse("sport")) System.out.println("Sport has been deleted");
		else System.out.println("No data found!");
		System.out.println(ani.getName()+" is a "+ani.getStatus());  //add polymorfism
		
		System.out.println("\n \n");
		Student arnold = new Student("Arnold S","Chicago"); //create new object of class Student
		arnold.addCourseGrade("math", 9);
		arnold.addCourseGrade("chemistry", 8);
		arnold.printGrades();
		System.out.println(arnold.getName()+" ,average of his grade "+arnold.getAverageGrade());
		System.out.println(arnold.toString());
		System.out.println(arnold.getName()+" is a "+arnold.getStatus()); //add polymorfism
	}
	

}
