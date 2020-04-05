package HRmanagement;
import java.util.Scanner;
public class MainHRMANAGEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kitchen[] myemployee= new Kitchen[5];  //initialization of object employee, ignore object type being called kitchen
		
		Scanner scan= new Scanner (System.in);
		
		int T;//Total weekly wage
		int ID;//ID
		int s;//Status of employee
		int h;//hours worked per week
		int sa;//Salary per hour
		
		
		for(int i=0;i<myemployee.length;i++) {
			
			System.out.println("Enter employee status: if you want kitchen worker enter 2, Waiter enter 3, Management enter 4: \n");
		    s= scan.nextInt();
		    
		    if(s==2);  //Tells system that if user enter 2(kitchen worker) then it should the hourly salary to 11 and so on for other workers
		    sa=11;
		    if(s==3);  
		    sa=15;
		    if(s==4);   //The problem I am having could relate to this section of code. When user inputs type of employee, the code is not recognising the salary amount it should be using and always defaults to using $20/h as salary
		    sa=20;      // For eg: if user enters employee type 2 (kitchen) and other required info, the code calculates weekly wage for employee type 4 (management, management has $20 salary) and not kitchen.
			
			System.out.println("enter employee ID for worker : \n");
			ID= scan.nextInt(); //Saves employee ID entered by user
			
			System.out.println("enter employee no. of hours: \n");
			h= scan.nextInt(); //Saves no. of hours employee work per week entered by user
		
			if(h>50); //If user enter weekly hours greater than max (50) then salary should be calculated using the below formula
			T= (sa*50)+(20*h-1000);
			
			if(h<=50); //If user enters hours which is less than or equal to max hours per week, salary should be calculated with below formula
			T= sa*h;
			
			
			
			
		    
			System.out.println("Your total weekly wage is:" +T);
			System.out.println("Your employee ID is:" +ID);     // Outputs all details required
		    System.out.println("Your employee status type is:" +s);
		    System.out.println("The no. of hours your employee work a week is:" +h);
			System.out.println("Thanks for using weekly salary calculator");
			
		
		}
		
	}

}

