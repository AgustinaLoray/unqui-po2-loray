package tp3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class punto4 {
	String a = "abc";
	String s = a;
	String t;
	
	@Test
	void test() {
		assertEquals(3, s.length());
		assertEquals("ABC",a.toUpperCase());
		assertEquals(4,"Libertad".indexOf("r"));
		assertEquals(7,"Universidad".lastIndexOf('i'));
		assertEquals("il","Quilmes".substring(2,4));
	}
}