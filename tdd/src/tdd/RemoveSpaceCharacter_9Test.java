package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveSpaceCharacter_9Test {

	@Test
	void test() {
		assertEquals("This Red car ",RemoveSpaceCharacter_9.removeSpeChar("This@Red$car-"));
	}

}
