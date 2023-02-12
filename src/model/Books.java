/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Feb 11, 2023
 */
package model;

/**
 * @author Chance
 *
 */
public class Books {
	private String title;
	private int price;
	
	public Books() {
		super();
	}
	
	public Books(String title) {
		this.title = title;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getPrice() {
		return this.price;
	}
		
}
