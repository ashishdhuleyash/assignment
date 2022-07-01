package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Palindrome_Q2Test {

	@Test

	void test() {
		assertEquals("asjj",Palindrome_Q2.stringpalindrome("abcdea", "bcdesg"));
	}
}