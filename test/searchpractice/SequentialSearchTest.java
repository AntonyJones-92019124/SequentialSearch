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
public class SequentialSearchTest {
    
    public SequentialSearchTest() {
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
     * Test of SequentialSearchSolution.contains() method on array of int, of class 
     */
    @Test
    public void testContains() {
        System.out.println("Running test cases for contains(int[] collection, int term)");
              
        // Test 1 - with small collection
        int [] collection = {3, 56, 67, 43, 10, 2};
        assertEquals(true, SequentialSearch.contains(67, collection));
        assertEquals(true, SequentialSearch.contains(2, collection));
        assertEquals(true, SequentialSearch.contains(3, collection));
        assertEquals(false, SequentialSearch.contains(35, collection));
        assertEquals(false, SequentialSearch.contains(1, collection));
       
       // Test 2 - with very large collection   
       // collection = IntStream.range(0, 299999997).toArray();
       // assertEquals(true, SequentialSearch.contains(299999990, collection));
       //assertEquals(false, SequentialSearch.contains(299999998, collection));

    }

    /**
     * Test of indexOf method, of class SequentialSearchSolution.
     */
    @Test
    public void testIndexOf() {
        System.out.println("Runing test cases for indexOf(int[] collection, int term)");
        
       // Test 1 - with small collection
        int [] collection = {3, 56, 67, 43, 10, 2};
        assertEquals(2, SequentialSearch.indexOf(67, collection));
        assertEquals(5, SequentialSearch.indexOf(2, collection));
        assertEquals(0, SequentialSearch.indexOf(3, collection));
        assertEquals(-1, SequentialSearch.indexOf(35, collection));
        assertEquals(-1, SequentialSearch.indexOf(1, collection));
 }

}
