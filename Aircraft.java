package myTest;

public class Aircraft {
	// TODO Auto-generated method stub
			// main method
	public int callSign;
	public int regNo;
	public int type; 
	
	
	private int Code; 
	private String pilotName; 
	private String destination; 
	
	public Aircraft (int c, int r, int t) {
	this.callSign = c; 
	this.regNo = r;
	this.type = t;
	
	}
		
	public int getCode() { 
		return this.Code; 
	}

	public void setCode(int C) { 
		this.Code = C; 
	}

	public String getpilotName() {
		return this.pilotName;
	}
	
	public void setpilotName(String N) {
		this.pilotName = N;
	}
	
	public String getdestination() {
		return this.destination;
	}
	
	
	
	
}