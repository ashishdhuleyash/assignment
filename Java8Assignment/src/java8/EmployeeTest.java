package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Ashish"));
		list.add(new Employee(2,"Adarsh"));
		list.add(new Employee(3,"Nikhil"));
		list.add(new Employee(4,"Mayur"));
		list.add(new Employee(5,"Navnath"));
		list.add(new Employee(6,"Satish"));
		list.add(new Employee(7,"Pratik"));
		list.add(new Employee(8,"Chetan"));
		list.add(new Employee(9,"Somesh"));
		list.add(new Employee(10,"Ankush"));
		
		//list to map
		Map<Integer,String> map =list.stream().collect(Collectors.toMap(E1->E1.getId(), E1->E1.getName()));
		System.out.println(map);
		
		Set<Employee> set=list.stream().collect(Collectors.toSet());
		for (Employee emp:set)
			System.out.println("EmpId:"+emp.id +" "+"EmpName:"+emp.name);
	}

}
