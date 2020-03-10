package week3;
import java.util.Scanner; 
public class AircraftMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aircraft[] obj  = new Aircraft [10];
		
		Scanner input = new Scanner(System.in); // can use "in" instead of input
		
		int x;
		int y;
		int z;
		int w;
		String v;
		int u;
		for(int i= 0; i< obj.length; i++) {
		System.out.println("Enter the callSign\n");
		x= input.nextInt(); //store input as an int
		System.out.println("Enter the regNo \n");
		y= input.nextInt(); 
		System.out.println("Enter the type \n");
		z= input.nextInt();
		System.out.println("Enter the type transPoder \n");
		w= input.nextInt();
		System.out.println("Enter the type pilotName \n");
		u= input.nextInt();
		System.out.println("Enter the type destination\n");
		
			
		System.out.println("Succesfully filled in element \n");
		obj[i] = new Aircraft(x,y,z);
		System.out.println("This box has a printDetails of: \n" + obj[i].printDetails());
		System.out.println("This box is a Aircraft of: \n" + obj[i].Aircraft);

		}
	
	System.out.println("Finished");
	input.close();

		}
}

	
