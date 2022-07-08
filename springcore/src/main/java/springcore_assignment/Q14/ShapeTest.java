package springcore_assignment.Q14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {
	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
	
	System.out.println("Rectangle:");
	Rectangle obj=(Rectangle) ctx.getBean("ibean14");
	System.out.println("Area of Rectangle :"+obj.area());
	System.out.println("Perimeter of Rectangle :"+obj.side());
	
	System.out.println("Square:");
	Square obj1=(Square) ctx.getBean("ibean141");
	System.out.println("Area Of  Square :"+obj1.area());
	System.out.println("Peri Of  Square:"+obj1.side());
	
	System.out.println("Circle:");
	Circle obj2=(Circle) ctx.getBean("ibean142");
	System.out.println("Area Of Circle :"+obj2.area());
	System.out.println("Peri Of Circle :"+obj2.side());
	}
	
}
