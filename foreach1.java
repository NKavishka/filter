import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class foreach1 {

	public static void main(String[] args) {
		
//		Employee.getAllEmployees().forEach(e->
//				System.out.println(e.getName()));
		
		
//		List<Employee> sortedEmployeeByLength = Employee.getAllEmployees().stream()
//				.sorted((e1,e2)-> new Integer(e1.getName().length())
//						.compareTo(e2.getName().length())).collect(Collectors.toList());
//		
		
		Employee.getAllEmployees().stream().filter(e->e.getName().length()>=5)
		.map(e->new Employee(e.getName().toUpperCase()))
		.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()).forEach(e->
				System.out.println(e.getName()));
		
	}
}
