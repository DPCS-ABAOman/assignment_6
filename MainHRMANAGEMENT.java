package HRmanagement;
import java.util.Scanner;
public class MainHRMANAGEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kitchen[] myemployee= new Kitchen[1];
		
		Scanner scan= new Scanner (System.in);
		
		int T;//Total weekly wage
		int ID;//ID
		int s;//Status of employee
		int h;//hours worked per week
		int sa;//Salary per hour
		
		
		for(int i=0;i<myemployee.length;i++) {
			
			System.out.println("Enter employee status: if you want kitchen worker enter 2, Waiter enter 3, Management enter 4: \n");
		    s= scan.nextInt();
		    
		    if(s==2);  
		    sa=11;
		    if(s==3);  
		    sa=15;
		    if(s==4);
		    sa=20;
			
			System.out.println("enter employee ID for worker : \n");
			ID= scan.nextInt();
			
			System.out.println("enter employee no. of hours: \n");
			h= scan.nextInt();
		
			if(h>50);
			T= (sa*50)+(20*h-1000);
			
			if(h<=50);
			T= sa*h;
			
			
			
			
		    
			System.out.println("Your total weekly wage is:" +T);
			System.out.println("Your employee ID is:" +ID);
		    System.out.println("Your employee status type is:" +s);
		    System.out.println("The no. of hours your employee work a week is:" +h);
			System.out.println("Thanks for using weekly salary calculator");
			
			
	
			
			
		
		}
		
		
		

		
		
	}

}

