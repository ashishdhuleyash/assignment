package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarks {
    public static void main(String[] args) {
		List<Integer> list=Arrays.asList(85,75,78,90,95,65,99);
		List<Integer> obj=list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(obj);
	}

}
