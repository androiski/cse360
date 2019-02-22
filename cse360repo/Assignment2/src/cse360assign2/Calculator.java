/**
 * @author Andrew Murza
 * ID		499
 * Assignment 2
 * 
 * Calculator.java contains definitions for a Calculator
 * 
 * Calculator.java is a class that adds, subtracts, multiplies
 * or divides a total value and prints the changes the operator made 
 * on the value over the course of the program
 */

package cse360assign2;

public class Calculator {
	
	/**
	 * {@link int} for holding the total int value
	 */
	private int total;
	
	/**
	 * Default constructor for calculator class
	 */
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
		
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
	 * @param value is added to total
	 */
	public void add (int value) {
		
		this.total += value;
		
	}
	/**
	 * Method for performing a subtract to total
	 * @param value is subtracted from total
	 */
	public void subtract (int value) {
		
		this.total -= value;
		
	}
	
	/**
	 * Method for performing a multiply to total
	 * @param value is multiplied by the total
	 */
	public void multiply (int value) {
		
		this.total *= value;
		
	}
	
	/**
	 * Method for performing a division to total
	 * @param value is used to divide total by value
	 */
	public void divide (int value) {
		
		if(value == 0) {
			this.total = 0;
		}
		else {
			this.total /= value;
		}
	}
	
	/**
	 * Method to display the history of operations done on total
	 * @return a string displaying the operations executed in succession 
	 */
	public String getHistory () {
		
		return "";
		
	}
}
