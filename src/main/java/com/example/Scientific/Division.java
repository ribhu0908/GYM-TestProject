package com.example.Scientific;

public class Division {
    public int division(int a, int b){
        try{
            int ans = a/b;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero error");
            return Integer.MIN_VALUE;
        }
        return a/b;
    }
    public double division(double a, double b){
        try{
            double ans = a/b;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero error");
            return Integer.MIN_VALUE;
        }
        return a/b;
    }
}
