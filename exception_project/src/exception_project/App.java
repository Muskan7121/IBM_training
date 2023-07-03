package exception_project;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFactory factory=new EmployeeFactory();
		try {
			factory.createEmployee();
		} catch (NumberFormatException e) {
			System.err.println("Error Occured "+ e.getMessage());
		}catch (SalaryCheckException e ) {
			System.err.println(e.getErrorMsg());
		}catch( NameCheckException e) {
			System.err.println(e.getErrMsg());
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
