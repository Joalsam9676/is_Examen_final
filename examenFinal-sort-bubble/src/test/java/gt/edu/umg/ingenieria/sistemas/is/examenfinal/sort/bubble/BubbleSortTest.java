/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jasm
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of sortBasic method, of class BubbleSort.
     */
        
    @Test
    public void testPrueba1(){
        
        System.out.println("Prueba 1");
        int[] input = new int[]{1, 2, 3, 5, 4};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals(expectedResult, actualResult);
        
    }
    
    @Test
    public void testPruba2(){
        System.out.println("Prueba 2");
        int[] input = null;
        int[] expectedResult = null;
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testPrueba3(){
        System.out.println("Prueba 3");
        int [] input  = new int[]{2,2,2,2};
        int[] expectedResult = new int[]{2, 2, 2, 2};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testPrueba4(){
        System.out.println("Prueba 4");
        int[] input = new int[]{};
        int[] expectedResult = new int[]{};
        int[] actualResult = BubbleSort.sortBasic(input);
        assertArrayEquals(expectedResult, actualResult);
    }
    
}
