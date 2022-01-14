package com.example.Operations;

public class printthreetimes {
    public int print(int n1,int n2)
    {
        int sum = 0;
        while(n1>0)
        {
            System.out.println("Inner loop started ");
           for(int i=0;i<n2;i++)
            {
                sum = sum+n1;
            }

            System.out.println("Inner loop ended ");
            n1--;
        }

        System.out.println("outer loop ended ");
        return sum;
    }
}
