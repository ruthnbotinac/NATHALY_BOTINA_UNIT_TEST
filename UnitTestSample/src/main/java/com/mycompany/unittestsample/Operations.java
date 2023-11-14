/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unittestsample;

/**
 *
 * @author Natucha
 */
public class Operations {
    
    public static int NextNumber(int userNumber){
        return userNumber + 1;
    }
    
    public static boolean IsDivisible(int firstNumber, int secondNumber){
        int moduleResult = secondNumber % firstNumber;
        return moduleResult == 0;
    }
}
