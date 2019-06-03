import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		
//		students.entrySet().stream().filter(e-> e.getValue() >= passMark)
//			.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(e -> {
//			    System.out.println("Name : " + e.getKey() + " Marks : " + e.getValue());
//			});
		
		
		Map<Integer, String> vehicles = new HashMap<>();
		vehicles.put(10,"Car");
		vehicles.put(50, "SUV");
		vehicles.put(20,"Jeep");
		vehicles.put(12,"Bus");
		vehicles.put(15,"Ship");
		vehicles.put(16,"Lorry");
		vehicles.put(2,"Cycle");
		
		vehicles.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.forEach(e->{System.out.println("No : "+ e.getKey()+ " Vehicle: "+ e.getValue());});
		System.out.println();
		
		List<String> values = new ArrayList<>();
		List<Integer> keys = new ArrayList<>();
		vehicles.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.peek(e-> keys.add(e.getKey())).collect(Collectors.toList())
		.stream().filter(e-> e.getValue() != "Ship")
		.sorted(Map.Entry.comparingByValue())
		.peek(e-> values.add(e.getValue())).collect(Collectors.toList());
		
		
		System.out.println(keys + " " + values );
		
//		List<String> strings = new ArrayList<>();
//		students.entrySet().stream().filter(e-> e.getValue() >= 60)
//			.sorted(s1,s2)->-s1.getValue().compareTo
	}
	
	
}
