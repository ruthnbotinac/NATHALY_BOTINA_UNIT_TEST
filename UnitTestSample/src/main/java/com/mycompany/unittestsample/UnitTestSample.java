/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unittestsample;
import java.util.Scanner;
import com.mycompany.unittestsample.Operations;

/**
 *
 * @author Natucha
 */
public class UnitTestSample {

    public static void main(String[] args) {
        
        System.out.println("Select one of the options below");
        System.out.println("1. Add next number");
        System.out.println("10. Based two numbers return devisible");
        //Ejercicio 2
        //Ejercicio 4
        Scanner in = new Scanner(System.in);
        String userResult = in.next();
        
        switch (userResult) {
            case "1":
                System.out.println("Type an integer number");
                String userNumber = in.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
            case "10":
                System.out.println("Type an integer number");
                String firstDivisbleNumber = in.next();
                System.out.println("Type a second integer number");
                String secondDivisbleNumber = in.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisbleNumber), Integer.parseInt(secondDivisbleNumber));
                if(result){
                    System.out.println(secondDivisbleNumber + "is divisible into " + firstDivisbleNumber);
                }else{
                    System.out.println(secondDivisbleNumber + "is not divisible into " + firstDivisbleNumber);
                }
                break;
            case "15":
               System.out.println("This is a test of one merge");
            case "13":
              System.out.println("This is a test of one merge");
              break;
            case "16":
                System.out.println("prueba....");
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
