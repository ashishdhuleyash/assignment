package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator_Q13Test {

	 @Test
	    void add() {
	        assertEquals(22, Calculator_Q13.add(12, 10));
	    }
	    @Test
	    void sub() {
	        assertEquals(15, Calculator_Q13.sub(20, 5));
	    }
	    @Test
	    void mul() { 
	        assertEquals(45, Calculator_Q13.mul(15, 3));
	    }
	    @Test
	    void div() {
	        assertEquals(10, Calculator_Q13.div(20, 2));
	    }
	    @Test
	    void mod() {
	        assertEquals(15, Calculator_Q13.mod(115, 20));
	    }
	    @Test
	    void power() {
	        assertEquals(64,Calculator_Q13.power(8, 2));
	    }
	    @Test
	    void sqrt() {
	        assertEquals(5, Calculator_Q13.sqrt(25));
	    }
	}