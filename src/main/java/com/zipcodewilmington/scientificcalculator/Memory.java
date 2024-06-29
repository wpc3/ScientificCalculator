package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private double memory =0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public static double clearMemory(double memory){
    memory = memory*0;
    return memory;
    }

}
