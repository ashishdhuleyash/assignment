package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOrNot_Q8Test {

	@Test
	void test() {
		assertEquals(4,EvenOrNot_Q8.count(new int[] {1,2,3,4,5,6,7,8,9}));
	}

}
