package cse360assign3;
import java.util.*;

public class OrderedIntList {

    private int[] array;
    private int counter;
    private String number = "";
    private String arrayStr = "";

    OrderedIntList () {
        array = new int[10];
        counter = 0;
    }
    
    OrderedIntList(int size){
    	array = new int[size];
    	counter = 0;
    }

    public void insert (int inputinteger) {
    	
    	//if full make 50%+
    	if(size() == length()) {
    		int[] temp = new int[length() + length()/2];
    		
    		for (int index = 0; index < size(); index++) {
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

            if (properindex <= length() -1 && !duplicate) {
                if (counter < length()) {
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


 //////////////////////////////////////////////////////////////   
    public int size () {
    	return counter;
    }
    
    public int length () {
    	return  array.length;
    	
    }
    
    public int findIndex(int key) 
    { 

        int counter = 0; 
        
        while (counter < length()) { 
  
            if (array[counter] == key) { 
                return counter; 
            } 
            else { 
                counter+= 1; 
            } 
        } 
        return -1; 
    } 

    public void delete (int key) {
    		
    	int deleteIndex = findIndex(key);
    	
    	if(deleteIndex == -1) {
    		System.out.println(key + " was not found in the array. Nothing was deleted");
    	}
    	else {
    		for(int intIndex = deleteIndex; intIndex < length() - 1; intIndex++){
        		array[intIndex] = array[intIndex + 1];
        	}
    		counter--;
    		System.out.println(key + " was found in the array. It was deleted");

    	}
    	
    	if(size() <= length()/2) {
    		int[] temp = new int[length()/2];
    		for (int index = 0; index < size(); index++) {
    			temp[index] = array[index];
    		}
    		array = temp;
    	}
    }
    
    public String toString() {
    	if(array == null) {
    		array = new int[0];
    	}
    	
    	for(int index = 0; index < size(); index++) {
    		number = Integer.toString(array[index]);
    		arrayStr += number + " ";
    	}
    	
    	return arrayStr.trim();
    	
    }
    
    
}

