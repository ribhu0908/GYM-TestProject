package com.example.Scientific;

public class Multiplication {
    public int multiply(int a, int b){
        if((long)a * (long)b > Integer.MAX_VALUE){
            System.out.println("Overflow");
            return -1;
        }
        return a*b;
    }
    public float multiply(float a, float b){
        if((double)a * (double)b > Float.MAX_VALUE){
            System.out.println("Overflow");
            return -1;
        }
        return a*b;
    }
}
