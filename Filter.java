
import java.util.List;

import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		//List<Employee> employees = Employee.getAllEmployees();
		
		List<Employee> employeeList = Employee.getAllEmployees().stream().filter(e->e.getName().length()>5).
				collect(Collectors.toList());
		System.out.println(employeeList);
		
//		for(Employee e : employeeList) {
//			System.out.println(e.getName() + " " + e.getMarks());
//		}
		
		
	}
}
