package springcore_assignment_1to6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Q4_Test {
	public static void main(String[] args) {
		List<Emp_Q4> list=new ArrayList<Emp_Q4>();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Emp_Q4 obj=(Emp_Q4) ctx.getBean("ibean4");
		Emp_Q4 obj1=(Emp_Q4) ctx.getBean("ibean41");
		list.add(obj);
		list.add(obj1);

		List<Emp_Q4> sorted=list.stream().sorted((e1,e2) ->Double.compare(e1.salary,e2.salary)).collect(Collectors.toList());


		for (Emp_Q4 emp:sorted) {
			emp.employeeDetails();
		}
	}
}