package springcore_assignment.Q13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	Collection obj=(Collection) ctx.getBean("ibean13");
	obj.show();
}
}
