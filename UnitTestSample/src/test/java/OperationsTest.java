/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.unittestsample.Operations;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Natucha
 */
public class OperationsTest {
    
    public OperationsTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void NextNumber_UserNumberGTown_AddedANumber() {
        
        //Arrange
        int userNumber = 10;
        int expectedResult = 11;
        
        //Act
        int result = Operations.NextNumber(userNumber);
        
        //Assert
        assertEquals(expectedResult,result);
        
    }
    
    @Test
    public void IsDivisible_TwoIntegerNumbers_IsDivisible() {
        
        //Arrange
        int firstNumber = 5;
        int secondNumber = 25;
        
        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Assert
        assertTrue(methodResult);
        
    }
    
    @Test
    public void IsDivisible_TwoIntegerNumbers_IsNotDivisible() {
        
        //Arrange
        int firstNumber = 5;
        int secondNumber = 6;
        
        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secondNumber);
        
        //Assert
        assertFalse(methodResult);
        
    }
}
