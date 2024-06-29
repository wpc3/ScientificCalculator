

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
    public static String getSecondStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println("Would you like to continue, y/ n?");
        return scanner.nextLine();
    }
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer x = scanner.nextInt();
        return x;
// System.out.println("Enter another value");
// Integer y = scanner.nextInt();
// String operator;
// String enteredValue = getStringInput(operator);
//
// if(operator){ z = x + y;
//
// }
// return null;
    }
    public static Double getDoubleInput(String prompt) {
        Scanner scanner2 = new Scanner(System.in);
        println(prompt);
        Double userDouble = scanner2.nextDouble();

        return userDouble;
    }
//    public static Integer getArithmetic(String operator, int x, int y){
//        //
//        switch (operator) {
//            case "+":
//                return x+y;
//            case "-":
//                return x-y;
//            case "/":
//                return x/y;
//            case "*":
//            case "x":
//                return x*y;
//            case "^":
//                return x * x;
//            case "sqr":
//                return (int) Math.sqrt(x);
//            case "exp":
//                return (int) Math.pow(x,y);
//            default:
//                System.out.println("does not recognise");
//                return null;
// if (Objects.equals(operator, "+")){
//
// } else if (Objects.equals(prompt, "-")){
// return -;
//
// }}
//        }
        //figure out which operator
        // make a switch statement to call for the appropriate operator method
//    }


    public static Double getArithmetic(String operator, Double x, Double y) {
        //


        switch (operator) {
            case "+":
                return (Arithmetic.addition(x,y));
            case "-":
                return (Arithmetic.subtraction(x,y));
            case "/":
                return (Arithmetic.division(x,y));
            case "inv":
                return (Arithmetic.inverse(x));
            case "[-]":
            case    "[+]":
                return (Arithmetic.posAndNeg(x));
            case "*":
            case "x":
                return (Arithmetic.multiplication(x,y));
            case "^":
            case "exp":
                return (Arithmetic.power(x,y));
            case "sqr":
                return  (Arithmetic.square(x));
            case "sqrt":
                return (Arithmetic.squareRoot(x));
            case "sin":
                return (Arithmetic.sin(x));
            case "invsin":
                return (Arithmetic.inverseSin(x));
            case "invcos":
                return (Arithmetic.inverseCosine(x));
            case  "cos":
                return (Arithmetic.cosine(x));
            case "tan":
                return (Arithmetic.tangent(x));
            case "invtan":
                return (Arithmetic.inverseTangent(x));
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
//     Will come back to this. Maybe wrap this into a if/else or method?




//    public static double toDoPositiveAndNegative(double value) {
//        value = value * -1;
//        return value;

}