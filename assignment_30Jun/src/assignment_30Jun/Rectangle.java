package assignment_30Jun;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	

	public Rectangle() {
		
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}
	
	
}
