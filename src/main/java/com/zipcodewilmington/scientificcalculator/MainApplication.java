package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//        String s = Console.getStringInput("Enter a string");


//        String s = Console.getStringInput("Enter an operator");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
        Console.println("Your answer is %s", i);
//        Console.println("The user input %s as a d", d);



    }
}
