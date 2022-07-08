package springcore_assignment.Q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Item obj=(Item) ctx.getBean("ibean8");
		obj.display();
		
		System.out.println("---Ascending Order---");
		obj.ascending();
		
		System.out.println("---Descending Order---");
		obj.discending();
		
		System.out.println("---Remove Duplicate Record");
	}

}
