package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Console;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Display display = new Display();

        Console.println("Welcome to our calculator!");

        String preferredDisplay = Console.getStringInput("DEG or RAD");

        display.switchDisplayMode(preferredDisplay);



        System.out.println();

        Double firstInt = Console.getDoubleInput("Enter a command");
        String operator = Console.getStringInput("Enter next command or operator");
        Double secondInt = Console.getDoubleInput("Enter next command");

        System.out.println(firstInt + operator + secondInt + "=" + Console.getArithmetic(operator,firstInt,secondInt));

        String equation = firstInt + operator + secondInt + "=" + Console.getArithmetic(operator,firstInt,secondInt);

        int index = equation.lastIndexOf("=");
        double result = Double.parseDouble(equation.substring(index+1));

//        double trigResult = Console.switchDisplay("DEG or RAD" + preferredDisplay + result);

        String continue2 = Console.getStringInput("Would you like to continue, y or n?");

        if (continue2.equalsIgnoreCase("yes") || continue2.equalsIgnoreCase("y")){
            String operator2 = Console.getStringInput("Enter next command or operator");
            Double continuedOperations = Console.getDoubleInput("Enter next command");

            System.out.println(continuedOperations + operator2  + "=" + Console.getArithmetic(operator2,continuedOperations,result));
        }else{
            System.out.println(result);
            scanner.close();
        }
    }
}