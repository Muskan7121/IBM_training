package assignmentJava;

import java.util.Scanner;

public class IncomeTaxCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the earning of the employee: "); 
        double earning = sc.nextDouble(); 
        double incomeTax = calculateIncomeTax(earning); 

        System.out.println("Income tax to be paid: " + incomeTax); 

    } 

 

    public static double calculateIncomeTax(double earning) { 
        double incomeTax = 0; 

        if (earning > 50000 && earning <= 60000) { 
            incomeTax = (earning - 50000) * 0.1; 

        } else if (earning > 60000 && earning <= 150000) { 
            incomeTax = 10000 + (earning - 60000) * 0.2; 

        } else if (earning > 150000) { 
            incomeTax = 10000 + 18000 + (earning - 150000) * 0.3; 

        } 

        return incomeTax; 
	}

}
