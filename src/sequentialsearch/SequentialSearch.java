package sequentialsearch;

import java.util.In;

//import utils.Stopwatch;

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
 * 
 * @author Computer Power Plus
 */

public class SequentialSearch {

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

          int n = collection.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(collection[i] == term) 
            return i; 
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
        int[] collection = { 0, 1, 2, 3, 4, 10, 40 };
        
        try{ 
            in = new In(args[1]);
            collection = in.readAllInts();
        term = 2;
        int result = indexOf(term, collection); 
        
        if(result == -1) 
            System.out.print("Element is not present in array"); 
        else
            System.out.print("Element is present at index " + result);

            
            // Start timer - you may use your own implementation 

            //            or the utility class Stopwatch that is provided

            
            // Search for term in collection by calling appropriate class methods

            // Stop timer

            // Print result

        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);

        }
    } 
}