package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question_3Test {

	@Test
	void test()  throws Exception{
	 assertEquals(true,Question_3.checkuser(" ashish@gmail.com", "Ashish@123"));
	}

}
