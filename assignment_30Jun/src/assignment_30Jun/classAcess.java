package assignment_30Jun;

import java.util.Scanner;

public class classAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=0;
		 do {
			 System.out.println("1. Area of Rectangle...");
			 System.out.println("2. Area of Circle...");
			 System.out.println("3. Area of Triangle...");
			 System.out.println("0. Exit..");
			 System.out.print("Enter your choice: ");
			 String choice_1 = sc.next();
			 ch = Integer.valueOf(choice_1);
			 
			 switch(ch) {
			 case(1):
				 int width,length;
				 System.out.println("Enter the length of rectangle");
			 	length=sc.nextInt();
			 	System.out.println("Enter the width of rectangle");
			 	width=sc.nextInt();
			 	Rectangle rectangle= new Rectangle(length,width); 
			 	System.out.println("Area of Rectangle: " +rectangle.getArea()+"\n\n");
			 	break;
			 case(2):
				 int radius;
			 System.out.println("Enter the radius of circle");
		 	radius=sc.nextInt();
		 
		 	Circle circle= new Circle(radius); 
		 	System.out.println("Area of Circle: " +circle.getArea()+"\n\n");
			 	 break;
			 case (3):
			int base,height;
			 System.out.println("Enter the base of Triangle");
			 
		 	base=sc.nextInt();
		 	System.out.println("Enter the height of Triangle");
		 	height=sc.nextInt();
		 	Triangle triangle= new Triangle(base,height); 
		 	System.out.println("Area of Triangle: " +triangle.getArea()+"\n\n");
			 	 break;
			
			 case 0:
				 System.out.println("Bye!");
			 	 System.exit(0);
			 	 break;
			 default:
				 System.out.println("\n Invalid choice!\n");
				 break;
	}

		 }while(ch!=0);
		 }}
