package HRmanagement;
import java.util.Scanner;
public class MainHRMANAGEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int w;
int d;
int t;

	Scanner read= new Scanner(System.in);//Initializing scanner

	System.out.println("Please enter how many kitchen workers you have");
	
	w= read.nextInt();//record how many kitchen workers are needed
	
	Kitchen[]kemployee= new Kitchen[w]; //Initializes array of kitchen workers with n workers
	
	for(int i=0; i<kemployee.length;i++) { 
		
		System.out.println("Enter the ID of your kitchen employee ");
		d= read.nextInt();  //Saves Employee ID
		
		System.out.println("Enter how many hours the employee works per week");
		t= read.nextInt();  //Saves employee hours per week worked
		
		kemployee[i]=new Kitchen(d,t); //Saves ID and hours per week in array kemployee
	
	}
	
	for(int i=0; i<kemployee.length; i++) {  //loops through data recieved for n kitchen workers and print their details out to command line
		kemployee[i].printdetails();
	}
	
	
	
System.out.println("Please enter how many waiter workers you have"); //Same process for waiter workers
	
	w= read.nextInt();
	
	Waiter[]wemployee= new Waiter[w];
	
	for(int i=0; i<wemployee.length;i++) {
		
		System.out.println("Enter the ID of your waiter employee ");
		d= read.nextInt();
		
		System.out.println("Enter how many hours the employee works per week");
		t= read.nextInt();
		
		wemployee[i]=new Waiter(d,t);
	
	}
	
	for(int i=0; i<wemployee.length; i++) {
		wemployee[i].printdetails();
	}
	
	
	
System.out.println("Please enter how many management workers you have"); //Same process for management workers
	
	w= read.nextInt();
	
	Management[]memployee= new Management[w];
	
	for(int i=0; i<memployee.length;i++) {
		
		System.out.println("Enter the ID of your management employee ");
		d= read.nextInt();
		
		System.out.println("Enter how many hours the employee works per week");
		t= read.nextInt();
		
		memployee[i]=new Management(d,t);
	
	}
	
	for(int i=0; i<memployee.length; i++) {
		memployee[i].printdetails();
	}

	System.out.println("THANKS FOR USING EMPLOYEE WAGE CALCULATOR!:)");	
		
		
		
		
		
		
	}

}

