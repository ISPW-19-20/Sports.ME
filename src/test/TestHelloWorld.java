package test;

import logic.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHelloWorld {
	
	@Test
	public void foo() {
		HelloWorld.main(null);
		assertEquals(0, 0);
	}

}
