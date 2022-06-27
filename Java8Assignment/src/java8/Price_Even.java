package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Price_Even {
	public static void main(String[] args) {


		List<Items> list=new ArrayList();
		list.add(new Items(1,"Mouse",500f));
		list.add(new Items(2,"Keyboard", 507f));
		list.add(new Items(3,"Speker", 1500f));
		list.add(new Items(4,"Charger", 400f));
		List<Float> check=list.stream().filter(s ->s.itemprice%2 == 0).map(s ->s.getItemprice()).collect(Collectors.toList());
		System.out.println("Even numbers are:"+check);
	}
}