package springcore_assignment_1to6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindMax_Test_Q5 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		FindMax_Q5 obj=(FindMax_Q5) context.getBean("ibean5");
		obj.maxNum();
	}

}
