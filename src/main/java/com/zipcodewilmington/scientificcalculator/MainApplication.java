package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to our calculator!");
        Integer firstInt = Console.getIntegerInput("Enter first value");
        String operator = Console.getStringInput("Enter an operator");
        Integer secondInt = Console.getIntegerInput("Enter second value");
        System.out.println(firstInt + operator + secondInt + "=" + Console.getArithmetic(operator,firstInt,secondInt));

//        Double d = Console.getDoubleInput("Enter a double.");



//        String o = Console.getStringInput("Enter an operator");

//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
       // Console.println("Your answer is %s", i);
//        Console.println("The user input %s as a d", d);



    }
}
