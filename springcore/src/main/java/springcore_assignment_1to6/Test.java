package springcore_assignment_1to6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Average_of_Numbers_Q2 obj=(Average_of_Numbers_Q2) con.getBean("ibean");
		obj.sum();
	}

}
