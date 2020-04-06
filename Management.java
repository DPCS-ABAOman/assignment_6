package HRmanagement;

public class Management extends EMPLOYEE {

	public Management(int ID, int hours) { //Management constructor
		super(ID,hours); //super class constructor (Management class inherites common properties from EMPLOYEE class
	}
	
	int s= 20; //Management salary
	
	public int getSal() { //method to find weekly wage for management worker
		return (s*this.hours);
	}
	
	public void printdetails() { //method which print all management worker details
		System.out.println("Employee ID is: \n" +this.ID);
		System.out.println("Hours employee works a week: \n" +this.hours);
		System.out.println("Employee status:Management");
		System.out.println("Weekly wage is: \n" +this.getSal());
	}
	
	
	
	
	
}
