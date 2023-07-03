package exception_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeFactory {

	private BufferedReader br=null;
	private EmployeeService es=null;
	private Employee employee;
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		es=new EmployeeServiceImpl();
		employee=new Employee();
	}
	
	public void createEmployee()throws IOException,NumberFormatException, NameCheckException, SalaryCheckException{
		System.out.print("Enter Employee Name: ");
		String eName=br.readLine();
		System.out.print("Enter Employee Salary: ");
		double eSalary=Double.parseDouble( br.readLine());
		if (eName.length()<4) {
			throw new NameCheckException("invalid Name...");
		}
		if (eSalary < 1000) {
			throw new SalaryCheckException("invalid salary...");
		}
		
		employee.setName(eName);
		employee.setSalary(eSalary);
		Employee e=es.createEmployee(employee);
		System.out.println("Employee Created: "+e);
	}
}
