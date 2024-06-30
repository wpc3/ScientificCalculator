package com.zipcodewilmington.scientificcalculator;

public class Display {
    private double clear;
    private String display;


    public double getClear() {
        clear = 0;
        return clear ;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public String getDisplay() {
        return display;
    }

    public void switchDisplayMode(String display) {
        this.display = display;
    }

    public Double convertToBinary(double binary){
        return 0.0;
    }

    public Double convertToHexidecimal(double hexidecimal){
        return 0.0;
    }

    public Double convertToOctal(double octal){
        return 0.0;
    }

    public Double convertToDecimal(double decimal){
       decimal = 0;
        return decimal;
    }

    public Double convertToDegrees(double num){
        return Math.toDegrees(num);
    }

    public Double convertRadian(double num){
        return Math.toRadians(num);
    }




}
