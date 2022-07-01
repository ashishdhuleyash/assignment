package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Student_Q12Test {

	@Test
	void test() throws CloneNotSupportedException{
		Student_Q12 s=new Student_Q12(1,"Ashish");
		Student_Q12 s1=(Student_Q12)s.clone();
		assertEquals(true,Student_Q12.checkClone(s, s1));
	}

}
