/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentgrade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    //test for A mark with 100 grade ==> should pass
    @Test
    public void testGrade_A_100(){
        System.out.println("test for A mark with 95 grade");
        int mark = 100;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for A mark with 95 grade ==> should pass
      @Test
    public void testGrade_A_90(){
        System.out.println("test for A mark with 90 grade");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for B mark with 90 grade ==> should fail
    @Test
    public void testGrade_B_90(){
        System.out.println("test for B mark with 90 grade");
        int mark = 90;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for F mark with 90 grade ==> should fail
    @Test
    public void testGrade_F_90(){
        System.out.println("test for F mark with 90 grade");
        int mark = 90;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for A mark with 80 grade ==> should fail
    @Test
    public void testGrade_A_80(){
        System.out.println("test for A mark with 80 grade");
        int mark = 80;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for B mark with 80 grade ==> should pass
    @Test
    public void testGrade_B_80(){
        System.out.println("test for BB mark with 80 grade");
        int mark = 80;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for A mark with 80 grade ==> should fail
    @Test
    public void testGrade_F_80(){
        System.out.println("test for F mark with 80 grade");
        int mark = 80;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for A mark with 70 grade ==> should fail
    @Test
    public void testGrade_A_70(){
        System.out.println("test for A mark with 70 grade");
        int mark = 70;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for B mark with 70 grade ==> should fail
    @Test
    public void testGrade_B_70(){
        System.out.println("test for B mark with 70 grade");
        int mark = 70;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for F mark with 70 grade ==> should pass
    @Test
    public void testGrade_F_70(){
        System.out.println("test for F mark with 70 grade");
        int mark = 70;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for A mark with 150 grade ==> should fail
    @Test
    public void testGrade_A_150(){
        System.out.println("test for A mark with 150 grade");
        int mark = 150;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    //test for F mark with 150 grade ==> should pass
    @Test
    public void testGrade_F_150(){
        System.out.println("test for F mark with 150 grade");
        int mark = 150;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
}
