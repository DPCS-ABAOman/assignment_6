package HRmanagement;

public class Waiter extends EMPLOYEE {
 
	public Waiter(int ID, int h) { //waiter employee constructor
		super(ID,h); //inherites superclass common properties
	}
	
	
	int s= 15; //Salary for waiter
	
	public int getSal() {  //method for weekly salary for waiter employee
		if(this.hours>50) {
		return((s*50)+(20*this.hours-1000));
		
	}
	else {
		return (s*this.hours);
		
	   }
	}
	
	 
	public void printdetails() {  //method which prints out all details of waiter
		System.out.println("Employee ID is: \n" +this.ID);
		System.out.println("Hours employee works a week: \n" +this.hours);
		System.out.println("Employee status:Waiter");
		System.out.println("Weekly wage is: \n" +this.getSal());
	}
	
	
	
	
	
	
	
}
