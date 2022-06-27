package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Price_Lessthan_Avg {
  public static void main(String[] args) {
	List<Items> list=new ArrayList();
	list.add(new Items(1,"Mouse",500f));
	list.add(new Items(2,"Keyboard",500f));
	list.add(new Items(3,"Speker",1500f));
	list.add(new Items(4,"Charger",400f));
	
	Double avg=list.stream().collect(Collectors.averagingDouble(e ->e.itemprice));
	System.out.println("Average of Item Price"+avg);
	
	List<Items> min=list.stream().filter(e1 ->e1.itemprice <avg).map(e1 ->e1).collect(Collectors.toList());
	for(Items items:list) {
		System.out.println(items.itemname+ " "+ items.itemprice);
	}
	
}
}
