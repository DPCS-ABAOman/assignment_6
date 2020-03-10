package week3;

public class Aircraft {

	public String callSign ;
	public String regNO ;
	public String type;
	private int transpoderCode;
	private String pilotName;
	private String destination;
	
	public Aircraft(int c, int r, int t) {
		this.callSign = "c";
		this.regNO = "r";
		this.type = "t";
	}
	public int gettranspoderCode() {
		return this.transpoderCode;
}
	public void settranspoderCode(int s) {
		this.transpoderCode = s;
	}
	public String getpilotName() {
		return this.pilotName;
	}
	public void setpilotName(String p ) {
		 this.pilotName = p;
			}
	public String setdestination() {
		return this.destination;
	}
	public void getdestination(String d) {
		this.destination =d;
	}
	public void printDetails() {
		System.out.println();
			}
	public void Aircraft() {
		System.out.println();
	}
}
