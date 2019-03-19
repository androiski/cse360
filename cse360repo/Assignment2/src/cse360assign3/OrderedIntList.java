/**
 * @author Andrew Murza
 * ID		499
 * Assignment 3
 * 
 * OrderedIntList.java contains definitions for Assignment 3
 * 
 */
package cse360assign3;

public class OrderedIntList {

/*
 * For simplicity I used Professor Calliss's "perfected" code for this assignment
 * I did not comment on anything that was already provided
 * I did comment on any methods I had to revise or include
 */
    private int[] array;
    private int counter;
    private String number = "";
    private String arrayStr = "";

    OrderedIntList () {
        array = new int[10];
        counter = 0;
    }

    public void insert (int inputinteger) {
    	
    	//I added this if statement to check the size of the array in comparison to its length
    	//if full make it 50% bigger
    	if(length() == size()) {
    		int[] temp = new int[size() + size()/2];
    		
    		for (int index = 0; index < length(); index++) {
    			temp[index] = array[index];
    		}
    		array = temp;
    	}
    	
        if (counter == 0) {
            array[0] = inputinteger;
            counter++;
        }
        else {
            int properindex = 0;
            boolean duplicate = false;

            while (properindex < counter && inputinteger >= array[properindex]
                    && !duplicate) {
                if (inputinteger == array[properindex]) {
                    duplicate = true;
                }
                properindex++;
            }

            if (properindex <= size() -1 && !duplicate) {
                if (counter < size()) {
                    for (int currentindex = counter; currentindex > properindex;
                         currentindex--) {
                        int previousindex = currentindex - 1;

                        array[currentindex] = array[previousindex];

                    }
                    array[properindex]= inputinteger;
                    counter++;
                }
                else {
                    for (int currentindex = counter - 1; currentindex >
                            properindex; currentindex--) {
                        int previousindex = currentindex - 1;

                        array[currentindex] = array[previousindex];
                    }
                    array[properindex]= inputinteger;
                }
            }
        }
    }
    
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
    /*   
     * 
     *                    BELOW BEGINS THE ADDED METHODS FOR THIS ASSIGNMENTS
     * 
     */
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    //this is the overloaded constructor
    //if one decides to not want the size of the array to begin at the default of 10
    //they can use the parameters of this to make it whatever size they please
    OrderedIntList(int size){
    	array = new int[size];
    	counter = 0;
    }
    
    //this int method takes in no parameters
    //since counter is an int variable used throughout the insert and delete functions of this class
    //I found that it corresponds to the amount of ints in the array
    //thus making it appropriate to use as a return for this method
    public int length() {
    	return counter;
    }
    
    //this int method takes in no parameters
    //it does a simple array.length call to return a int size of the array
    public int size() {
    	return  array.length;
    	
    }
    
    //this int method was not part of the assignment. I wrote it in to assist with the delete function
    //it takes in int key as a parameter
    //then it searches for the location of the key
    //it returns -1 if it did not find
    //if it did find it returns the int counter value which tells us where the key is
    public int findIndex(int key) 
    { 

        int counter = 0; 
        
        while (counter < size()) { 
  
            if (array[counter] == key) { 
                return counter; 
            } 
            else { 
                counter+= 1; 
            } 
        } 
        return -1; 
    } 

    //this void method takes in int key as a parameter, being the item we want to delete
    //the method first uses the findIndex method to find the location (deleteIndex) in the array of the int we want to delete 
    //this assumes there is only one of each int in the array. 
    //if findIndex returns a -1 this method returns a statement indicating it was not found
    //otherwise it will shift everything to the right of the key we wanted to delete to the left.
    //this makes the next int replace the one we wanted to delete and avoids weird spacing or empty spots in the array
    //this method  also checks the size to decrease the size of the array if the length is less than half the size
    public void delete (int key) {
    		
    	int deleteIndex = findIndex(key);
    	
    	if(deleteIndex == -1) {
    		System.out.println(key + " was not found in the array. Nothing was deleted");
    	}
    	else {
    		for(int intIndex = deleteIndex; intIndex < size() - 1; intIndex++){
        		array[intIndex] = array[intIndex + 1];
        	}
    		counter--;
    		System.out.println(key + " was found in the array. It was deleted");

    	}
    	
    	//compares length() of array to its size(). If the length is less than half we create
    	//a temp array which is half the size of the old one and store everything into temp
    	//then we make the old array be the new temp. Making it a new size
    	if(length() <= size()/2) {
    		int[] temp = new int[size()/2];
    		for (int index = 0; index < size()/2; index++) {
    			temp[index] = array[index];
    		}
    		array = temp;
    	}
    }
    
    //toString takes in no parameters 
    //it returns a string consisting of the integers in the array with a space in between each int
    public String toString() {
    	if(array == null) {
    		array = new int[0];
    	}
    	
    	arrayStr = "";
    	for(int index = 0; index < length(); index++) {
    		number = Integer.toString(array[index]);
    		arrayStr += number + " ";
    	}
    	
    	return arrayStr.trim();
    	
    }
    
    
}

