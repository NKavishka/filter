import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Process {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee.getAllEmployees().stream().
				map(e->new Employee("Eng: " + e.getName())).collect(Collectors.toList());
		
		List<Employee> employeeMarksList = Employee.getAllEmployees().stream().
				map(e->new Employee(e.getName(), e.getMarks()*2)).collect(Collectors.toList());
		
		
		List<Employee> eListwithI = Employee.getAllEmployees().stream().filter(e->e.getName().contains("i"))
				.map(e->new Employee(e.getName(), e.getMarks()*3)).collect(Collectors.toList());
		
		Long count = Employee.getAllEmployees().stream().filter(e-> e.getName().contains("i")).count();
		
		System.out.println(employeeList);
		System.out.println(employeeMarksList);
		System.out.println(eListwithI);
		System.out.println(count);
		
		List<Student> studentList = Student.getAllStudents().stream()
				.filter(s-> Period.between(s.getDOB(),LocalDate.now()).getYears()>18).collect(Collectors.toList());
		
		System.out.println(Student.getAllStudents());
		System.out.println(studentList);
		
		
	}
}
