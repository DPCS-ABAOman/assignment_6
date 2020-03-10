package test2;
import java.util.Scanner;
public class AirportDB {
	public static void main(String[] args) {
	String type;
	int RegNo;
	String callSign;
	int TransponderCode;
	String PilotName;
	String Destination;
	Scanner input = new Scanner(System.in);
	Aircraft Aircrafts[] = new Aircraft[10];
		for (int i = 0; i < Aircrafts.length; i++) {	
		System.out.println("Enter the type: ");
		type = input.next();
		System.out.println("Enter the Registration Number: ");
		RegNo = input.nextInt();
		System.out.println("Enter the Call Sign: ");
		callSign = input.next();
		System.out.println("Enter the Transponder Code: ");
		TransponderCode = input.nextInt();
		System.out.println("Enter the Pilot's Name: ");
		PilotName = input.next();
		System.out.println("Enter the Destination: ");
		Destination = input.next();
		System.out.println("Successfully entered in Flight " +(i+1) +"'s data");
		Aircrafts[i] = new Aircraft(type, RegNo, callSign, TransponderCode, PilotName, Destination);
			}	
		System.out.println("Finished");
		input.close();
	}
	
}
