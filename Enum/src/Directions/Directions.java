package Directions;

public enum Directions {
	   NORTH ("N", "Forward"), 
	   EAST  ("E", "Right"), 
	   SOUTH ("S", "Backwards"), 
	   WEST  ("W", "Left");
	   
	
	    Directions(String abrev, String motion) {
	        this.abrev = abrev;
	        this.motion = motion;
	    }
	    
	    public String getAbrev() {
			return abrev;
		}

		public String getMotion() {
			return motion;
		}

		private final String abrev;
	    private final String motion;
	   
	    public void printInfo() {
	    	System.out.println(this.abrev + " is the same as moving " + this.motion);
	    }
}
