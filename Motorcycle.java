package uoi;

public class Motorcycle extends Vehicle {

	 int Enginecap; //attributes required for motorcycle
	 String type;
	 
	 public Motorcycle(int c, String m, int y, String mo, int e, String t) { //Motrocycle constructor
	  super(c,m,y,mo); //inherites attributes from superclass
	  
	  this.Enginecap=e;
	  this.type= t;
	  
	   }
	 
		 public void Rac() {  //method that prompts inspection if motorcycle is a racing type
				if(this.type.equals("racing")) {
					System.out.println("Inspection needed as vehicle is of type racing");
				}
				} 
		 
		 public void printdetails() { //prints motorcycle details to command line when needed
			    System.out.println("Vehicle Make: \n" +this.Make);
		    	System.out.println("Vehicle Model: \n" +this.Model);
		    	System.out.println("Model Year: \n" +this.Year);
		    	System.out.println("Vehicle Category: Motorcycle");
		    	System.out.println("Seating Capacity: 2");
		    	inspec();
		    	Rac();
		 }
	 
	
	
	
}
