package uoi;
import java.util.Scanner;
public class VehicleMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int z; //stores array length
	String x; //stores vehicle make
	String v; //stores vehicle model
	int u; //stores model year
	int h; //used for many purposes
	int se; //stores seating cap
	int cha;// stores chassis number
	String pur; //used for many purposes
	String tra; //stores whether trailer is needed or not
	double wei; //stores truck weight
		
		Scanner scan= new Scanner(System.in); //Intializing scanner object
		
		
		System.out.println("Please enter how many cars need new licenses");
		
		z= scan.nextInt(); //stores how many cars are needed
		
		Car[] mycar= new Car[z]; //initializes array of "Z" cars
		
		for(int i=0; i<mycar.length; i++) {  //loops through questions "Z" times
			
			
			System.out.println("Enter make of car \n");
		    x= scan.next();   //stores user input for given question
		    
		    System.out.println("Enter car model \n"); 
		    v= scan.next();
		    
		    System.out.println("Enter model year \n");
		    u= scan.nextInt();
		    
		    System.out.println("Enter car hp from 0-1000 \n");
		    h= scan.nextInt();
		    while(h>1000) {                    //checks if user has entered in accurate amount, if not prompts user to enter again      
		    	System.out.println("HP too high!, re enter HP");
		    	h= scan.nextInt();
		    }
		    
		    System.out.println("Enter seating capacity from 2-8 \n");
		    se= scan.nextInt();
		    while(se>8) {
		    	System.out.println("Seat capacity too high!, re enter seat capacity");
		    	se= scan.nextInt();
		    }
		    
		    System.out.println("Enter car Chassis no. 8 digits \n");
		    cha= scan.nextInt();
		    
		    mycar[i]= new Car(h,se,cha,x,u,v);  //saves user data in array of Car constructor
		    
		    	}
		
		for(int i=0;i<mycar.length;i++) {  //prints details of vehicle
			mycar[i].printdetails();
		}
		
		
		
		
		System.out.println("\nPlease enter how many Trucks need new licenses");
		
		z= scan.nextInt();
		
		Truck[] mytruck= new Truck[z];
		
		for(int i=0; i<mytruck.length;i++) {
			
			System.out.println("Enter make of Truck \n");
		    x= scan.next();
		    
		    System.out.println("Enter Truck model \n");
		    v= scan.next();
		    
		    System.out.println("Enter model year \n");
		    u= scan.nextInt();
		    
		    System.out.println("Enter truck weight 0-50tons \n");
		    wei= scan.nextDouble();
		    while(wei>50) {
		    	System.out.println("Weight too high!, re enter weight");
		    	wei= scan.nextDouble();
		    }
		    
		    System.out.println("Enter Trucks purpose, just as seen here with same capitilization: cargo, hazardousmaterial, fuel \n");
		    pur= scan.next();
		    
		    System.out.println("Does your truck have a trailer: true or false? \n");
		    tra= scan.next();
		    
		    System.out.println("Enter truck Chassis no. 8 digits \n");
		    cha= scan.nextInt();
			
		   mytruck[i]= new Truck(cha,x,u,v,wei,pur,tra);   
		 
		}
		
		for(int i=0; i<mytruck.length;i++) {
			mytruck[i].printdetails();
		}
		
		
		System.out.println("\nPlease enter how many motorcycles need new licenses ");
		
		z= scan.nextInt();
		
		Motorcycle[] mymotor= new Motorcycle[z];
		
		for(int i=0;i<mymotor.length;i++) {
			
			System.out.println("Enter make of Motorcycle \n");
		    x= scan.next();
		    
		    System.out.println("Enter Motorcycle model \n");
		    v= scan.next();
		    
		    System.out.println("Enter model year \n");
		    u= scan.nextInt();
			
		    System.out.println("Enter Motorcycle Chassis no. 8 digits \n");
		    cha= scan.nextInt();
		    
		    System.out.println("Motorcycle engine capacity 0-1500 \n");
		    h= scan.nextInt();
		    while(h>1500) {
		    	System.out.println("Engine cap too high!, re enter engine cap");
		    	h= scan.nextInt();
		    }
		    
		    System.out.println("Enter motorcycle type just as seen here with same capitilization: racing, cruiser, off-road \n");
		    pur= scan.next();
		    
		     mymotor[i]= new Motorcycle(cha,x,u,v,h,pur);
		     
		}
		
		for(int i=0; i<mymotor.length;i++) {
			mymotor[i].printdetails();
		}
		
		System.out.println("\nTHANKS FOR USING RENEWING VEHICLE LICENSE HELP!:)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
