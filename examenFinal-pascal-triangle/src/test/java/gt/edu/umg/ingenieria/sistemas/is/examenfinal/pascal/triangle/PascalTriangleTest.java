/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

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
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
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

    
     
    @Test
    public void prueba(){
        System.out.println("Pueba1");
        int input = 1;
        String expectedResult = "[1]\n";
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);
        assertEquals("prueba fallo", expectedResult, actualResult);
    }
    
    @Test
    public void prueba1(){
        System.out.println("Prueba 2");
        int input = 3;
        int resultado = 3;
        PascalTriangle pascalTriangle = new PascalTriangle();
        int actualResult = pascalTriangle.build(input).split("\n").length;
        assertEquals("Prueba fallo", resultado, actualResult);
    }
    
  @Test(expected = java.lang.OutOfMemoryError.class)
  public void prueba3(){
      System.out.println("Prueba 3");
           
        int input = Integer.MAX_VALUE;
        String expectedResult = "";
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);
        assertEquals(expectedResult, actualResult);
  }
    
}
