package HRmanagement;

public class Kitchen extends EMPLOYEE {
 
	
	public Kitchen(int ID, int h) { //Constructor for Kitchen class
		super(ID,h); //inherites common properties from super class (super class constructor)
	}
	
	int s= 11; //salary for kitchen worker
	
	public int getSal() {  //method to calculate weekly salary for kitchen worker
		if(this.hours>50) {
		return((s*50)+(20*this.hours-1000));
		
	}
	else {    //if overtime does not occur this method will be performed
		return (s*this.hours);
		
	   }
	}
	
	
	public void printdetails() { //method to print details of kitchen worker
		System.out.println("Employee ID is: \n" +this.ID);
		System.out.println("Hours employee works a week: \n" +this.hours);
		System.out.println("Employee status:Kitchen");
		System.out.println("Weekly wage is: \n" +this.getSal());
	}
	
	
	
	
	
	
	
	
	
}
