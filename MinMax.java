import java.util.Optional;
import java.util.Comparator;
public class MinMax {
	public static void main(String[] args) {
		
		Optional<Employee> employeemin = Employee.getAllEmployees().stream()
				.min(Comparator.comparing(Employee::getMarks));
		Optional<Employee> employeemax = Employee.getAllEmployees().stream()
				.max(Comparator.comparing(Employee::getMarks));
		
		System.out.println(employeemin.get());
		System.out.println(employeemax.get());
	}
}
