package javaFirstAssessment;

public class Person {
	protected String name; 
	protected String address; 
	
	public Person(String name, String address) {
		this.name = name; //set class atributte name with name
		this.address = address; //set address atributte name with address
	}
	
	public String getName() {
		return this.name; // return name
	}
	
	public String getAddress() {
		return this.address; //return address
	}
	
	public String toString() {
		return this.name+"("+this.address+")"; //convert to name(address)
	}
}
