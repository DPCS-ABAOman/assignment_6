package myTest;
import java.util.Arrays;
import java.util.Scanner; 
// Emilia
public class Class4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main method
	
	 Aircraft[] obj = new Aircraft [10];
		 
	 Scanner in = new Scanner(System.in);
		 
		int x;
		int y;
		int z;
		 
	for (int i = 0; i < obj.length; i++);{
		System.out.println("enter the ..... /n");
			x = in.nextInt();
		System.out.println("enter the ..... /n");
			y = in.nextInt();
		System.out.println("enter the ..... /n");
			z = in.nextInt();
			
		System.out.println("Sucessfully filled in elements" + i);
			
		obj[i] = new Aircraft (x, y, z);
		}
		
		System.out.println("Finished");
			in.close();
		 
	 
	 
	/* 
		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	
	    }
 
	Scanner in = new Scanner(System.in); 
	   System.out.println("This is the scanner input"); 
	    String input = input.nextLine();
	
	*/
	    
	//Part 2  
	    		// for (obj = 0; Aircraft.length; i++);   
	    		//  if(obj[i].getdestination > obj[i++].getdestination);
	    		//    	max = i++;
	    
	    
	}
}
