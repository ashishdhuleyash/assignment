package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueEmployeeName {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Ankush");
		list.add("Adarsh");
		list.add("Pratik");
		list.add("Pratik");
		list.add("Chetan");
		list.add("Mayur");
		
		List<String> list1=list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(list1);
	}

}
