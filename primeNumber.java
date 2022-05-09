package com.bridgelabz.logical;

import java.util.Scanner;

public class primeNumber {

    public static void main(String arg[])
    {
        int count=0;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;

            }
        }
        if(count==2)
            System.out.println(n+ " is a prime number");
        else
            System.out.println(n+ " is not a prime number");
    }
}