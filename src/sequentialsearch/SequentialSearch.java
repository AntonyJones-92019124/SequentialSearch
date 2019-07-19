/**
 * The class SequentialSearch provides a framework for implementing 
 * a sequential search algorithm, also known as linear search, on a collection
 * of integers given as input.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 *
 * "Collection" in this class is used in the broader sense 
 * and not in the strict Java sense. For example a collection may be an array 
 * or a list
 */
 

package sequentialsearch;

import utils.In;
import static org.junit.Assert.*;
//import utils.Stopwatch;


/*
 * @Date 19/07/2019
 * @author Computer Power Plus & Antony Jones 92019124
 */
public class SequentialSearch {
    
    //Step counters
    private static int step1Counter;
    private static int step2Counter;
    private static int step3Counter;
    
    //
    // YOUR TASK: refactor the class name to SequentialSearch, using the IDE
    //

 /**
 * Checks if collection contains an item.
 * @param term the search term, in this case an int
 * @param collection the collection to be searched, in this case an array of int
 * @return the boolean
 * 
 */ 
    

    public static boolean contains(int term, int[] collection){
        
        // This simply uses the algorithm you will implement in indexOf()
        return (indexOf(term, collection) != -1);

    }

 /**
 * Finds the index of an item in a collection if it contains an item.
 * 
 * @param term the search term, in this case an int
 * @param collection the collection to be searched, in this case an array of int
 * @return the int
 * 
 */    

    
    public static int indexOf(int term, int[] collection){
    
    //
        // YOUR TASK: implement a sequential search of term in collection -
    //  
    
    int n = collection.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(collection[i] == term)
        
            return i;
        
        //Increment step counter one for first step
        step1Counter++;
       
    }
        // default implementation: not found
        return -1;        
    }

/**
* Reads in 
* - a search term (integer)
* - a sequence of integers from a file (.txt file)
* both specified as a command-line argument;
* searches for the term in the collection of integers
* prints the result of the search and the time in seconds
*
* @param args the command-line arguments
*/
   
    
    public static void main(String[] args)  { 
          
        //Read the search term
        
        int term = Integer.parseInt(args[0]);
        
        // Read the input data stream (into the collection)
        // - this uses utility classes provided
        
        In in;
        int[] collection = {3, 56, 67, 43, 10, 2};
        try{ 
            in = new In(args[1]);
            collection = in.readAllInts();
               
        // Start timer own implementation
        long startTimer = System.currentTimeMillis();
        
        //Set timer to increment if less than 10000000
        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
            }
        
       //Small collection to check collection array for
        assertEquals(true, SequentialSearch.contains(67, collection));
        assertEquals(true, SequentialSearch.contains(2, collection));
        assertEquals(true, SequentialSearch.contains(3, collection));
        assertEquals(false, SequentialSearch.contains(35, collection));
        assertEquals(false, SequentialSearch.contains(1, collection));
        
        //Increment step counter two for second step
        step2Counter++;
        
        //boolean variable result set to int term from collection
        boolean result = contains(term, collection);
        
        //If variable result is equal to -1 print out not present in array        
        if(result == true) 
            System.out.print("Element is present at index " + result); 
        else
            System.out.print("Element is not present in collection array");
        
        //Increment step counter three for third step
        step3Counter++;
        
        // Stop timer       
        long stopTimer = System.currentTimeMillis();
        //Set stopTimer - startTimer value to elapsedTime variable     
        long elapsedTime = stopTimer - startTimer;
        
        //Print elaspeTime value in seconds      
        System.out.println(elapsedTime);
        
        //Print out amount of steps in the algorithm
        System.out.println("Total steps for algoritim are " + step1Counter  + " " +
                step2Counter + " " + step3Counter);
        
        } 
        
        catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);

        }//End of catch Exceeption
       
        
    }//End of main class
}//End of SequentialSearch class
