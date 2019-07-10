import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class greetingIsReturned {

	@Test
	void test() {
		Greeter testGreeter = new Greeter("Gail");
		assertEquals("Hello Gail", testGreeter.greeting());
	}
	
	void theEnd() {
		System.exit(99);
	}

}
