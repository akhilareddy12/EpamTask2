package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiply {

	@Test
	void test() {
		Junittesting test = new Junittesting();
		int output = test.multiply(2,1);
		assertEquals(2,output);
	}

}
