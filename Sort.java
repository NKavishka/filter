import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class Sort {

	public static void main(String[] args) {
		
		List<Employee> sortedEmployees = Employee.getAllEmployees().stream()
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		List<Employee> sortedEmployeeMarks = Employee.getAllEmployees().stream()
				.sorted(Comparator.comparing(Employee::getMarks)).collect(Collectors.toList());
		

		List<Employee> sorted2EmployeeMarks = Employee.getAllEmployees().stream()
				.sorted((e1,e2)-> e1.getMarks().compareTo(e2.getMarks())).collect(Collectors.toList());
		
		
		List<Employee> sortedEmployeeByLength = Employee.getAllEmployees().stream()
				.sorted((e1,e2)-> -new Integer(e1.getName().length()).compareTo(e2.getName().length())).collect(Collectors.toList());
								// - for reverse desc, remove - for asc
		System.out.println(sortedEmployees);
		System.out.println(sortedEmployeeMarks);
		System.out.println(sorted2EmployeeMarks);
		System.out.println(sortedEmployeeByLength);
	}
}
