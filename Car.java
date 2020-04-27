package uoi;

public class Car extends Vehicle {

	int hp;  //Attributes required for Car
	int seatcap;
	
	public Car(int hp, int s, int c, String m, int y, String mo ) {  //Constructor for Car
         super(c,m,y,mo); //Inherites superclass attributes
         
         this.hp= hp;
     	this.seatcap= s;
     
	}
	
	public void printdetails() {  //Prints car details to command line when needed
		System.out.println("Vehicle Make: \n" +this.Make);
		System.out.println("Vehicle Model: \n" +this.Model);
		System.out.println("Model year: \n" +this.Year);
		System.out.println("Vehicle Category: Car");
		System.out.println("Seating Capacity: \n" +this.seatcap);
		inspec();
		
	}
	
	
	
	
	
}
