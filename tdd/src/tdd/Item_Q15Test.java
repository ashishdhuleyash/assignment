package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Item_Q15Test {

		  @AfterEach
		    void tearDown() throws Exception {


		    }
		    @Test
		    void test() {
		        Item_Q15 i = new Item_Q15 (1,"pen", 200,500,LocalDate.of(2022,11,23),LocalDate.of(2023, 2, 22));

		        assertEquals(true,i.createObject(i));
		    }
		    }





