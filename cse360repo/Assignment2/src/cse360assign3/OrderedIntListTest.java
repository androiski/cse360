/**
 * @author Andrew Murza
 * ID		499
 * Assignment 3
 * 
 * OrderedIntListTest.java contains the junit test code for Assignment3
 * 
 */
package cse360assign3;

import static org.junit.Assert.*;
import org.junit.*;

public class OrderedIntListTest {
	
	
	/*
	 * This first test checks to size if the constructor constructs an array of size 10
	 */
	@Test
	public void testOrderedIntList() {
		OrderedIntList testList = new OrderedIntList();
		int expected = 10;
		assertEquals(expected, testList.size());
	}
	
	/*
	 * This tests the insert method
	 * it inserts 5 integers in no particular order 
	 * it checks if the ints were inserted as well as if in numeral order
	 * we also include some dupilcates to see if it adds them as well (it should not)
	 */
	@Test
	public void testInsert() {
		OrderedIntList testList = new OrderedIntList();
		testList.insert(4);
		testList.insert(5);
		testList.insert(1);
		testList.insert(1);
		testList.insert(3);
		testList.insert(2);
		testList.insert(5);
		String expected = "1 2 3 4 5";
		assertEquals(expected, testList.toString());
	}
	
	/*
	 * this tests the size method
	 * we first insert 10 ints and check again to make sure it is still size 10
	 * we add more to see if the size increases by 50% if we pass the limit
	 * we delete half to see if the size halves itself according to the edits we made
	 */
	@Test
	public void testSize() {
		OrderedIntList testList = new OrderedIntList();
		int expectedCt = 10;
		assertEquals(expectedCt, testList.size());
		
		testList.insert(1);testList.insert(2);
		testList.insert(3);testList.insert(4);
		testList.insert(5);testList.insert(6);
		testList.insert(7);testList.insert(9);
		testList.insert(9);testList.insert(10);
		expectedCt = 10;
		assertEquals(expectedCt, testList.size());
		
		
		testList.insert(11);
		testList.insert(12);
		testList.insert(13);
		testList.insert(14);
		expectedCt = 15;
		assertEquals(expectedCt, testList.size());
		
		testList.delete(1);testList.delete(2);
		testList.delete(3);testList.delete(4);
		testList.delete(5);testList.delete(6);
		testList.delete(7);testList.delete(9);
		testList.delete(9);testList.delete(10);
		expectedCt = 7;
		assertEquals(expectedCt, testList.size());
	}
	
	/*
	 * this method tests the return of the length method
	 * if we add X amount the length should also be X
	 * if we delete 1 the new length should be X-1
	 */
	@Test
	public void testLength() {
		OrderedIntList testList = new OrderedIntList();
		testList.insert(5);
		testList.insert(4);
		testList.insert(3);
		testList.insert(2);
		testList.insert(1);
		int expectedCt = 5;
		assertEquals(expectedCt, testList.length());

		testList.delete(3);
		expectedCt = 4;
		assertEquals(expectedCt, testList.length());
	}
	
	/*
	 * this method tests deletion and if it correctly deletes the correct int
	 * we inserted 1-5 and deleted 1, so the string should return 2-5
	 */
	@Test
	public void testDelete() {
		OrderedIntList testList = new OrderedIntList();
		testList.insert(1);
		testList.insert(2);
		testList.insert(4);
		testList.insert(5);
		testList.insert(3);
		testList.delete(1);
		String expected = ("2 3 4 5");
		assertEquals(expected, testList.toString());

	}
	
	/*
	 * this tests the toString which should return the ints in the array with spacing in between
	 */
	@Test
	public void testtoString() {
		OrderedIntList testList = new OrderedIntList();
		testList.insert(1);
		testList.insert(2);
		testList.insert(3);
		testList.insert(4);
		testList.insert(5);
		String expected = ("1 2 3 4 5");
		assertEquals(expected, testList.toString());
		
	}
	
	/*
	 * this tests the overloaded constructor should someone choose to create their array larger or smaller 
	 * than the default size of 10
	 */
	@Test
	public void testOverloadContructor() {
		OrderedIntList testList = new OrderedIntList(20);
		int expected = 20;
		assertEquals(expected, testList.size());
		
		testList = new OrderedIntList(8);
		expected = 8;
		assertEquals(expected, testList.size());
	}
}
