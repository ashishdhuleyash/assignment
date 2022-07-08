package springcore_assignment.Q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DistanceTest {
	 public static void main(String[] args) {
	        List<Distance> cityDistList = new ArrayList<Distance>();
	        Scanner sc = new Scanner(System.in);

	        ApplicationContext ctxobj = new ClassPathXmlApplicationContext("bean.xml");

	        Distance ct1 = (Distance) ctxobj.getBean("ibean9");
	        Distance ct2 = (Distance) ctxobj.getBean("ibean91");
	        Distance ct3 = (Distance) ctxobj.getBean("ibean92");
	        Distance ct4 = (Distance) ctxobj.getBean("ibean93");

	        cityDistList.add(ct1);
	        cityDistList.add(ct2);
	        cityDistList.add(ct3);
	        cityDistList.add(ct4);

	        System.out.println("enter from city name");
	        String fromCity = sc.next();

	        System.out.println("enter to city name");
	        String toCity = sc.next();

	        List<Distance> matchedList = cityDistList.stream().filter(c -> c.getFromcity().equalsIgnoreCase(fromCity))
	                .filter(c -> c.getTocity().equalsIgnoreCase(toCity)).collect(Collectors.toList());

	        if (!matchedList.isEmpty()) {
	            for (Distance cities : matchedList) {
	                System.out.print("distance between "+cities.getFromcity() +" & "+cities.getTocity()+" is "+cities.getDistance() + " Km");

	            }
	        } else
	            System.out.println("data not available");
	    }
}
