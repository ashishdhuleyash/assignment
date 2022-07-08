package springcore_assignment_1to6;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emi_Test {
	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("bean.xml");
		Emi_Q3 obj1=(Emi_Q3) obj.getBean("ibean3");
		System.out.println("interest rate "+obj1.rate+"%");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount");
		float amount=sc.nextFloat();
		
		System.out.println("Enter the Validity in Years:");
		int validity=sc.nextInt();
		int validityinmonth=validity*12;
		
		double TPA=amount +((amount*obj1.rate)/100)*validity;
		System.out.println("Total payble amount:"+TPA);
		
		double emi=TPA/validityinmonth;
		System.out.println("Emi:"+emi);
	}

}
