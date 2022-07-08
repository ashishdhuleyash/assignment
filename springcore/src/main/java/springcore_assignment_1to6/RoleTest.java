package springcore_assignment_1to6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
public static void main(String[] args) {
	ApplicationContext obj1=new ClassPathXmlApplicationContext("bean.xml");
	Role_Q1 ob=(Role_Q1) obj1.getBean("ibean1");
	ob.show();
}
}
