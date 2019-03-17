package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addtest {

	@Test
	void test() {
		Junittesting test = new Junittesting();
		int output = test.add(4,3);
		assertEquals(7,output);
	}

}
