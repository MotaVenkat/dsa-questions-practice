package org.example;

import java.util.Scanner;

public class CalculatorWay1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter values 1.addition , 2. substraction , 3.multiplecation 4.division");
        int n = scn.nextInt();
        System.out.println("Enter first digit");
        int a=scn.nextInt();
        System.out.println("Enter second digit");
        int b=scn.nextInt();
        if(n==1){
            System.out.println("The sum of the two numbers  :"+ (a+b) );
        }else if(n==2){
            System.out.println("The substraction of the two numbers :" +(a-b));
        }else if(n==3){
            System.out.println("The multiplecations of the two numbers :" +(a*b));

        }else if(n==4){
            System.out.println("The division of the two numbers :" +(a/b));
        }

    }
}
