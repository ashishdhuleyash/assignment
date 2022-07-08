package springcore_assignment_1to6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VowelTest_Q6 {
	public static void main(String[] args) {
		ApplicationContext objCTX = new ClassPathXmlApplicationContext("bean.xml");
		 Vowel_Q6 obj1 = (Vowel_Q6) objCTX.getBean("ibean6");
		 obj1.result();
	}
}


