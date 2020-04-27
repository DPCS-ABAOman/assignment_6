package uoi;

public class Vehicle {

	
	int Chassis;  //common attributes required for all vehicles
	
	String Make;
	
	String Model;
	
	int Year;
	
	
	public Vehicle(int c, String m, int y, String mo) { //constructor for vehicle
		
		this.Chassis= c;
		this.Make= m;
		this.Year= y;
		this.Model= mo;
		
	}
		
		
		
		public void inspec() {   //Method that prompt inspection if vehicle is more than 10 years old
			int a= 2020-this.Year;
			if(a>10) {
				System.out.println("Vehicle needs inspection since it is more than 10 years old");
			}
			else {
				System.out.println("No inspection needed in terms of age as Vehicle is not older than 10 years");
			}
			
		}
	 
		
		
		
	
		
}
