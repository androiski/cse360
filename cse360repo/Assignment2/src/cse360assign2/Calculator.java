/**
 * @author Andrew Murza
 * ID		499
 * Assignment 2
 * 
 * Calculator.java contains definitions for a Calculator
 * 
 */

package cse360assign2;

/**
 * 
 * @author Andrew Murza
 * 
 * Calculator is a class that adds, subtracts, multiplies
 * or divides a total value and prints the changes the operator made 
 * on the value over the course of the program
 */
public class Calculator {
	
	/**
	 * {@link int} for holding the total int value
	 */
	private int total;
	
	/**
	 * {@link String} private variable for history of operations performed
	 */
	private String history;
	
	/**
	 * Default constructor for calculator class
	 * initializes 0 to total and history
	 */
	public Calculator () {
		
		this.total = 0;  // not needed - included for clarity
		this.history = "0"; //initial history value should be zero
	}
	
	/**
	 * Displays total value of the operations done on total
	 * @return the int total of calculator
	 */
	public int getTotal () {
		
		return this.total;
		
	}
	
	/**
	 * Method for performing an add to total
	 * in this method the operation done is concatenated to the history string
	 * @param value is added to total
	 */
	public void add (int value) {
		
		this.total += value;
		this.history += (" + " + value);//concatenates operation to history String
		
	}
	/**
	 * Method for performing a subtract to total
	 * in this method the operation done is concatenated to the history string
	 * @param value is subtracted from total
	 */
	public void subtract (int value) {
		
		this.total -= value;
		this.history += (" - " + value);//concatenates operation to history String
		
	}
	
	/**
	 * Method for performing a multiply to total
	 * in this method the operation done is concatenated to the history string
	 * @param value is multiplied by the total
	 */
	public void multiply (int value) {
		
		this.total *= value;
		this.history += (" * " + value);//concatenates operation to history String
		
	}
	
	/**
	 * Method for performing a division to total
	 * To prevent divide by zero it will simply set total to zero 
	 * in this method the operation done is concatenated to the history string
	 * @param value is used to divide total by value
	 */
	public void divide (int value) {
		
		if(value == 0) {
			this.total = 0;
			
		}
		else {
			this.total /= value;
		}
		
		this.history += (" / " + value);//concatenates operation to history String
		
	}
	
	/**
	 * Method to display the history of operations done on total
	 * @return a string displaying the operations executed in succession 
	 */
	public String getHistory () {
		
		return this.history;
		
	}
}
