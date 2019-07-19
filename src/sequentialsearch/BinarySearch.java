package sequentialsearch;

import utils.In;
import utils.Stopwatch;

/**
 * The class BinarySearch provides a framework for implementing a binary 
 search algorithm.
 * 
 * Searching in collections is done to answer the following questions: 
 * - Does the element exists in a collection? -> method contains()
 * - How to get the element from a collection? - > method indexOf()
 *
 * @author Computer Power Plus
 */
public class BinarySearch {
    //
    // YOUR TASK: refactor the class name to BinarySearch, using the IDE
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
        // TO DO: Implement a binary search
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
        
        // Read the input data stream (the collection)
        In in;
        int[] collection;
        try{ 
            in = new In(args[1]);
            collection = in.readAllInts();
       
            // State intention
            System.out.print("Searching for " + term);
            System.out.println(" in collection " + args[1]);

            // Start timer
            Stopwatch timer = new Stopwatch();
            
            // Search for item
            boolean itemFound = contains(term, collection);

            // Stop timer
            System.out.println("Elapsed time = " + timer.elapsedTime() + " seconds");

            // Print result
            String resultStr = itemFound ? "found" : "not found";
            System.out.println("Search result: " + resultStr);

            
        } catch (java.lang.IllegalArgumentException e) {
            // Error with input data file
            System.out.println(e+ ": Incorrect data file as argument: " + args[1]);
        }
     
    } 
    
}
