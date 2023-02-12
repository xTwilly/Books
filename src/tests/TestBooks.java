/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Feb 11, 2023
 */
package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Books;


/**
 * @author Chance
 *
 */
public class TestBooks {
	Books book = new Books("Flames");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTitle() {
		assertEquals("Flames", book.getTitle());
	}
	
	@Test public void testPrice() {
		book.setPrice(10);
		assertEquals(10, book.getPrice());
	}
	
	

}
