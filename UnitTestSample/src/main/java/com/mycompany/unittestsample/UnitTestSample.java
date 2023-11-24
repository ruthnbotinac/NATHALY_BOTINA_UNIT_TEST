/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unittestsample;

import java.util.Random;
import java.util.Scanner;

import com.mycompany.unittestsample.Operations;

/**
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
            case "2":
                Random ran = new Random();
                int n2 = ran.nextInt(201);
                System.out.println(n2);

                System.out.println(Operations.randomNumer(n2));

                break;

            case "16":
                String digits = in.next();

                if (digits.length() > 4) {
                    System.out.println("The limit of digits is four");

                } else {
                    System.out.println(Operations.sumOfDigits(digits));
                }

                break;
            case "18":
                System.out.println("Type an integer number");
                System.out.println("Type an integer number2");
                System.out.println("Type an integer number3");
                String userNumber = in.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult = Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
            case "10":
                System.out.println("Type an integer number ----");
                String firstDivisibleNumber = in.next(); //Comments
                System.out.println("Type a second integer number---");
                String secondDivisibleNumber = in.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisibleNumber), Integer.parseInt(secondDivisibleNumber));
                if (result) {
                    System.out.println(secondDivisibleNumber + "is divisible into " + firstDivisibleNumber);
                } else {
                    System.out.println(secondDivisibleNumber + "is not divisible into " + firstDivisibleNumber);
                }
                break;
            case "12":
                System.out.println("This is a test of one merge");
            case "13":
                System.out.println("This is a test of one merge");
            default:
                throw new AssertionError();
        }

    }
}
