package HRmanagement;

public class Kitchen {

	int ID; // the id attribute would be a generic attribute for all employee types 
	
	String Status; // what is the purpose of the Status? wouldn't it be evident by the class identifier? 
	
	int Hours;
	
	int Salary; // isn't the salary a unique quantity (that is hardcoded) for each type of employee? 
	
	public Kitchen(int ID, String s, int h, int sa) { //Constructor for the object type kitchen with given parameters
		
		this.ID=ID;
		this.Status=s;   //gives contructor variables a place to store data
		this.Hours=h;
		this.Salary=sa;
		
	}
	
	
	public int Calcsal() {. //method for calculating salary
		return (this.Hours*this.Salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
