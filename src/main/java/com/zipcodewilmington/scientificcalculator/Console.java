package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;
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
        println(prompt);
        Integer x = scanner.nextInt();
        return x;
//        System.out.println("Enter another value");
//        Integer y = scanner.nextInt();
//        String operator;
//        String enteredValue = getStringInput(operator);
//
//      if(operator){ z = x + y;
//
//      }
//        return null;
    }
    public static Double getDoubleInput(String prompt) {
        Scanner scanner2 = new Scanner(System.in);
        println(prompt);
        Double userDouble = scanner2.nextDouble();

        return userDouble;
        }

        public static Integer getArithmetic(String operator, int x, int y){
            //

            switch (operator) {
                case "+":
                    return x+y;
                case "-":
                    return x-y;
                case "/":
                    return x/y;
                default:
                    System.out.println("does not recognise");
                    return null;
//            if (Objects.equals(operator, "+")){
//
//            } else if (Objects.equals(prompt, "-")){
//                return -;
//
//            }}
            }
            //figure out which operator
    // make a switch statement to call for the appropriate operator method

        }
}



