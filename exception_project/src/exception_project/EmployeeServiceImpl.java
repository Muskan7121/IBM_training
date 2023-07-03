package exception_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	private List<Employee> emp;{
		emp =new ArrayList<>();
		}
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employee.setId(new Random().nextInt(100));
		emp.add(employee);
		return employee;
	}
	
	
}
