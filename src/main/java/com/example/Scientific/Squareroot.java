package com.example.Scientific;

public class Squareroot {
    public int root (int num){
        if(num < 0){
            System.out.println("Negative number");
            return -1;
        }
        int t;
        int sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!=0);
        return sqrtroot;
    }
}
