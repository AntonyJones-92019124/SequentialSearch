/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchpractice;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sequentialsearch.SequentialSearch;

/**
 *
 * @author Computer Power Plus
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contains method, of class BinarySearch.
     */
    @Test
    public void testContains() {
     System.out.println("Running test cases for contains(int[] collection, int term)");
              
        // Test case: with small SORTED collection
        int [] collection = {2, 3, 10, 43, 56, 67};
//        assertEquals(true, BinarySearch.contains(67, collection));
//        assertEquals(true, BinarySearch.contains(2, collection));
//        assertEquals(true, BinarySearch.contains(3, collection));
//        assertEquals(false, BinarySearch.contains(35, collection));
//        assertEquals(false, BinarySearch.contains(1, collection));
//       
//        // Test 2 - with very large collection   
//        collection = IntStream.range(0, 299999997).toArray();
//        assertEquals(true, BinarySearch.contains(299999990, collection));
//        assertEquals(false, BinarySearch.contains(299999998, collection));
    }

    /**
     * Test of indexOf method, of class BinarySearch.
     */
    @Test
    public void testIndexOf() {
         System.out.println("Runing test cases for indexOf(int[] collection, int term)");
        
         // Test case: with small SORTED collection
        int [] collection = {2, 3, 10, 43, 56, 67};
        assertEquals(0, SequentialSearch.indexOf(2, collection));
        assertEquals(1, SequentialSearch.indexOf(3, collection));
        assertEquals(2, SequentialSearch.indexOf(10, collection));
        assertEquals(3, SequentialSearch.indexOf(43, collection));
        assertEquals(4, SequentialSearch.indexOf(56, collection));
        assertEquals(5, SequentialSearch.indexOf(67, collection));
        assertEquals(-1, SequentialSearch.indexOf(68, collection));
        assertEquals(-1, SequentialSearch.indexOf(42, collection));
        assertEquals(-1, SequentialSearch.indexOf(-43, collection));
        assertEquals(-1, SequentialSearch.indexOf(1, collection));
    }

    /**
     * Test of main method, of class BinarySearch.
     */
    @Test
    public void testMain() {
        System.out.println("Not testing method main at this stage");
//        String[] args = null;
//        SequentialSearch.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
    }
    
}