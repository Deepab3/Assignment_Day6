package com.bridgelabz.logical;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        int number = 0;
        int reminder = 0;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = sc.nextInt();
        for (; number!=0; number /= 10){
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
        }
            System.out.println("Reversed number is: "+reverse);
        }
    }
