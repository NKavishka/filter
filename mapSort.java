import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;

public class mapSort {

	public static void main(String[] args) {
		
		Map<String, Integer> students = new HashMap<>();
		
		students.put("Krish", 100);
		students.put("Nuwan", 90);
		students.put("Bhagya", 60);
		students.put("Hasini", 95);
		students.put("Suranga", 65);
		students.put("Erandika", 55);
		
		Integer passMark = 61;
		
		students.entrySet().stream().filter(e-> e.getValue() >= passMark)
			.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(e -> {
			    System.out.println("Name : " + e.getKey() + " Marks : " + e.getValue());
			});
		
		
		Map<Integer, String> vehicles = new HashMap<>();
		vehicles.put(10,"car");
		vehicles.put(50, "SUV");
		vehicles.put(20,"Jeep");
		vehicles.put(12,"Bus");
		vehicles.put(15,"Ship");
		vehicles.put(16,"Lorry");
		vehicles.put(2,"Cycle");
		
		
		
//		List<String> strings = new ArrayList<>();
//		students.entrySet().stream().filter(e-> e.getValue() >= 60)
//			.sorted(s1,s2)->-s1.getValue().compareTo
	}
	
	
}
