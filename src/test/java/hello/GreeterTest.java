package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello("World"), containsString("Hello"));
	}

	@Test(expected = NullPointerException.class)
	public void greeterCalledWithNull() {
		greeter.sayHello(null);
	}

}
