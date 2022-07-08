package springcore_assignment.Q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Array_Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Array1 obj=(Array1) ctx.getBean("ibean71");
        obj.merge();
	}
}
