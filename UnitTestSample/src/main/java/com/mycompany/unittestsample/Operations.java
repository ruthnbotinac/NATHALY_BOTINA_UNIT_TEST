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

    public static int randomNumer(int n) {

        int n30 = (int) (n + (n * 0.3));

        return n30;
    }

    public static int sumOfDigits(String digits) {
        int suma = 0;

        char[] aux = digits.toCharArray();

        System.out.println("Cadena: " + digits);



        for (char i : aux) {
            String str = Character.toString(i);
            suma+=Integer.parseInt(str);
        }

        // System.out.println("Suma total: "+suma);
        return suma;
    }

}
