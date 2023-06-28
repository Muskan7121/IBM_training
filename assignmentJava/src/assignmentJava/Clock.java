package assignmentJava;

public class Clock {
	  private int hours; 
	    private int minutes; 
	    private int seconds; 
	    private boolean isAM; 
	 

	    public Clock(int hours, int minutes, int seconds) { 
	        this.hours = hours; 
	        this.minutes = minutes; 
	        this.seconds = seconds; 
	        this.isAM = true; 
	    } 

	    public boolean isValidTime() { 
	        return (hours >= 0 && hours <= 12) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60); 
	    } 

	    public void setTimeMode(boolean isAM) { 
	        this.isAM = isAM; 
	    } 

	    public String getTime() { 
	        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds); 

	        if (isAM) { 
	            time += " AM"; 
	        } else { 
	            time += " PM"; 
	        } 
	        return time; 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock =new Clock(11,45,30);
		
		if(clock.isValidTime()) {
			System.out.println("Time is valid");
		}
		else {
			System.out.println("Time is invalid");
		}
		
		clock.setTimeMode(false);
		String time=clock.getTime();
		System.out.println("Current Time: "+time);
	}

}
