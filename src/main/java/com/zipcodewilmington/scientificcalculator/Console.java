package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }



    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String operator = scanner.nextLine();

        return operator;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int z;
        println(prompt);
        Integer x = scanner.nextInt();
        System.out.println("Enter another value");
        Integer y = scanner.nextInt();
//        String operator;
//        String enteredValue = getStringInput(operator);
//
//      if(operator){ z = x + y;
//
//      }


        return null;}


    public static Double getDoubleInput(String prompt) {
        Scanner scanner2 = new Scanner(System.in);
        println(prompt);
        Double userDouble = scanner2.nextDouble();

        return userDouble;
        }

    }

