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
public class TestBooks2 {
	Books book = new Books("Mice");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTitle() {
		assertEquals("Mice", book.getTitle());
	}
	
	@Test 
	public void testPrice() {
		book.setPrice(200);
		assertEquals(200, book.getPrice());
	}
	
	@Test
	public void testNotNull() {
		assertNotNull(book);
	}
	
	

}
