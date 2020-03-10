package abhinav;

public class Aircraft {



	String callSign;
	int RegNo;
	String type;
	private String transponderCode;
	private String pilotName;
	private String destination;
	
	public Aircraft(String s, int r, String t1, String t, String p, String d) {
		
		this.callSign= s;
		this.RegNo= r;
		this.type= t1;
		this.transponderCode= t;
		this.pilotName= p;
		this.destination= d;}
		
		public String getCode() {
			return this.transponderCode;
		}
			
			public String getName() {
				return this.pilotName;
				}
			
			public String getDestination() {
		return this.destination;
		}
			
			public void setCode(String z) {
				this.transponderCode=z;
			}
			
				public void setName(String y) {
					this.pilotName=y;
				}
			
			
	}







