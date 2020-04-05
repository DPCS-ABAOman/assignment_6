package HRmanagement;

public class Kitchen {

	int ID;
	
	String Status;
	
	int Hours;
	
	int Salary;
	
	public Kitchen(int ID, String s, int h, int sa) {
		
		this.ID=ID;
		this.Status=s;
		this.Hours=h;
		this.Salary=sa;
		
	}
	
	
	public int Calcsal() {
		return (this.Hours*this.Salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
