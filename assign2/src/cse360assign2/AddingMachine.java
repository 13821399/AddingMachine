/**
 * Name: Yingqiang Liu
 * Class ID: 70642
 * Assignment Number: 2
 * <p>
 * This file contains the AddingMachine class, which contains a constructor and
 * several methods. This program implements an application
 * that can add several positive or negative number together.
 */
package cse360assign2;

/**
 * The AddingMachine class contains a constructor takes no parameter,
 * the getTotal method, the add method, the subtract method,
 * the toString method, and the clear method.
 * @author Yingqiang Liu
 */
public class AddingMachine {

	private int total;  //Integer variable which is the total of all numbers.
	private String transaction; //String contains the history of transaction.
	
	/**
	 * Class constructor which takes no parameter.
	 * The integer total will be initialized by 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		transaction = "0";  //The history should start with 0.
	}
	
	/**
	 * This method should return the current total number.
	 * 
	 * @return	The sum of all current numbers
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method should add the parameter to the total,
	 * and should update the history of transaction.
	 * 
	 * @param value	The number taken from user's input
	 */
	public void add (int value) {
		total = total + value;
		transaction = transaction + " + " + value;
	}
	
	/**
	 * This method should subtract the parameter from the total,
	 * and should update the history of transaction.
	 * 
	 * @param value	The number taken from user's input
	 */
	public void subtract (int value) {
		total = total - value;
		transaction = transaction + " - " + value;
	}
		
	/**
	 * This method should return the history of transaction in a string.
	 * 
	 * @return	The history of transaction
	 */
	public String toString () {
		return transaction;
	}

	/**
	 * This method should clean the total and all history of transaction.
	 */
	public void clear() {
		total = 0;
		transaction = "0";
	}
}
