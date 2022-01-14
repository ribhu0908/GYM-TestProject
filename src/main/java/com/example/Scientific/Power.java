package com.example.Scientific;

public class Power {
    public int power(int base , int exponent){
        if(exponent < 0){
            System.out.println("Negative Exponent");
            return -1;
        }
        int power= 1;
        for (int i = 1;i<=exponent;i++)

        power =power*base;

        return power;
    }
}
