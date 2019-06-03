import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private LocalDate DOB;
	
	public Student(String name, LocalDate dOB) {
		this.name = name;
		DOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", DOB=" + DOB + "]";
	}
	
	public static List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Krish", LocalDate.of( 2000 , Month.JANUARY , 1 )));
		students.add(new Student("Hasini", LocalDate.of( 1999 , Month.JANUARY , 1 )));
		students.add(new Student("Bhagya", LocalDate.of( 1995 , Month.JANUARY , 1 )));
		students.add(new Student("Nuwan", LocalDate.of(  2005, Month.JANUARY , 1 )));
		students.add(new Student("Suranga", LocalDate.of( 2004 , Month.JANUARY , 1 )));
		students.add(new Student("Amal", LocalDate.of( 2006, Month.JANUARY , 1 )));
		students.add(new Student("Erandika", LocalDate.of( 1996 , Month.JANUARY , 1 )));
		return students;
	}
	
	
}
