package uoi;

public class Truck extends Vehicle {

	double weight;  //Attributes required for truck
	String purpose;
	String trailer;
    public Truck(int c, String m, int y, String mo, double w, String p, String tr) { //constructor for truck
    	super(c,m,y,mo); //Inherites superclass attributes
    	
    	
    	this.weight= w;
    	this.purpose= p;
    	this.trailer= tr;
    }
     
   public void Haz() {  //method to prompt inspection if truck is carrying hazardous material
    		if(this.purpose.equals("hazardousmaterial")) {
    		System.out.println("Inspection needed. Truck carrying hazardous material ");
    		}
    	}
  
   	
    
    
    public void printdetails() {   //prints trucl details to command line when needed
    	System.out.println("Vehicle Make: \n" +this.Make);
    	System.out.println("Vehicle Model: \n" +this.Model);
    	System.out.println("Model Year: \n" +this.Year);
    	System.out.println("Vehicle Category: Truck");
    	System.out.println("Seating Capacity: 2");
    	System.out.println("Trailer included: \n" +this.trailer);
    	inspec();
    	Haz();
    }
    
    
    
    
    
}
