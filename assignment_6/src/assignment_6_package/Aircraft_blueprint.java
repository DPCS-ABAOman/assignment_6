package assignment_6_package;

public class Aircraft_blueprint {

	String callSign;
	int regNo;
	String type;

	private int transpoderCode;
	private String name;
	private String destination;
	
	public String Aircraft() {
		return this.Aircraft();
	}
	public int getCode(int i) {
		return this.getCode(i);
	}

	public int setCode(int x) {
	return this.setCode(x);	
	}
	public String getName() {
		return this.name; // see this example
	
	}
	public String setName(String s) {
		return this.setName (s); // check this line , you are returning the function itself?! 
	}
	public String getDestination() {
		return this.getDestination(); // you have to returm the variable , see the example for getName() 
		
	}	
	public String printDetails() {
		return this.printDetails(); // you are returning the function and not the variable in question 
			// also the return type should be void here 
	}
		
	
	}
