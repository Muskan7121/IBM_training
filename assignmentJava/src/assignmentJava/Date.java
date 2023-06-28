package assignmentJava;

//
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isValid() {
		if(month<1 || month >12) {
			return false;
		}
		
		if(day<1 || day> getDays(month,year)) {
			return false;
		}
		
		return true;
	}
	
	private int getDays(int month, int year) {
		int [] days= {31,28,30,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && isLeapYear(year)) {
			return 29;
		}
		else return days[month-1];
	}
	
	private boolean isLeapYear(int year) {
		return (year %4==0 && year %100 ==0 )  || (year %400==0);
		
	}
	
	public Date nextDay() {
		int nextDay=day+1;
		int nextMonth=month;
		int nextYear=year;
		
		if(nextDay> getDays(nextMonth,nextYear)) {
			nextDay=1;
			nextMonth++;
			
			if(nextMonth>12) {
				nextMonth=1;
				nextYear++;
			}
		}
		return new Date(nextDay, nextMonth,nextYear);
	}
	   public static void main(String[] args) { 

	        Date date = new Date(30, 6, 2023); 

	 

	        if (date.isValid()) { 

	            System.out.println("Date is valid."); 

	        } else { 

	            System.out.println("Date is invalid."); 

	        } 

	 

	        Date nextDay = date.nextDay(); 

	        System.out.println("Next day: " + nextDay.getDay() + "/" + nextDay.getMonth() + "/" + nextDay.getYear()); 

	    } 

	} 

