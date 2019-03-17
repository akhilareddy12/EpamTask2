package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divide {

	@Test
	void test() {
		Junittesting test = new Junittesting();
		int output = test.divide(5,0);
		assertEquals(-1,output);
	}

}
