package com.example.Scientific;

public class Factorial {
    public int factorial(int number){
        if(number < 0)return -1;
        int fact = 1;
        for(int i=1;i<=number;i++) {
            fact = fact * i;
        }
        return fact;
    }
}
