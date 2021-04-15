package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		/*Changed done by Narendra Mahato for test case 1*/
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

}
