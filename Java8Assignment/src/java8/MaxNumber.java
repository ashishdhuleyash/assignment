package java8;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(67,76,57,75,88,10);
		Integer obj=list.stream().max(Integer::compare).get();
		System.out.println("Maximum num from list:" +obj);
		Integer obj1=list.stream().max((o1,o2)->o1.intValue() >o2.intValue()?1:-1).get();
		System.out.println("Maximum Number is :"+obj1);
	}

}
