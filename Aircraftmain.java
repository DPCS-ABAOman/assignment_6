package abhinav;
import java.util.Scanner;
public class Aircraftmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aircraft[] aircrafts= new Aircraft[10];
		
		Scanner air= new Scanner (System.in);
		
		String a;
		int b;
		String c;
		String d;
		String e;
		String f;
		
		for(int i=0; i<aircrafts.length; i++) {
			
			System.out.println("Enter callsign: \n");
			a= air.nextLine();
			System.out.println("Enter RegNO.: \n");
			b= air.nextInt();
			System.out.println("Enter aircraft type: \n");
			c= air.nextLine();
			System.out.println("Enter transponder code: \n");
			d= air.nextLine();
			System.out.println("Enter pilot name: \n");
			e= air.nextLine();
			System.out.println("Enter destination of aircraft: \n");
			f= air.nextLine();
			System.out.println("Successfully stored data of flight " +(i+1));
		
			aircrafts[i]= new Aircraft(a,b,c,d,e,f);
			
		
		
				
			}
			

			
			
		}
		
		
		
		
		
	}


