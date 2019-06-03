import java.util.stream.Stream;
public class Array1 {

	public static void main(String[] args) {
		
		Employee[] employees = Employee.getAllEmployees().stream().toArray(Employee[]::new);
				
		
		// stream.of //////////////////////////////
		
		Stream.of(1,3,4,53,23,67,2,8).sorted().forEach(System.out::println);
		
	}
}
