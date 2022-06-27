package java8;

import java.util.ArrayList;
import java.util.List;

public class String_Lenght {
	public static void main(String[] args) {
		String [] str= {"Sachin","Dhoni","virat","Rohit","Bumrah","sreesant"};
		List<Integer>strcounts=new ArrayList<Integer>();
		for (String s:str) {
			int c=0;
			char[]arr=s.toCharArray();
			for (char ch:arr) {
				c++;
			}
			strcounts.add(c);
		}
		System.out.println(strcounts);
		Integer obj1=strcounts.stream().max((o1,o2)->o1.intValue() >o2.intValue()?1:-1).get();
		System.out.println("Max String in Above String Array :"+obj1);
	}	

}
