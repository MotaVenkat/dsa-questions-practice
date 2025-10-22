package org.example;

import java.util.Scanner;

public class CalculatorWay2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter values 1.addition , 2. substraction , 3.multiplecation 4.division");
        int choice = scn.nextInt();
        System.out.println("Enter first digit");
        int a=scn.nextInt();
        System.out.println("Enter second digit");
        int b=scn.nextInt();
        switch (choice){
            case 1: System.out.println("The sum of the two numbers  :"+ (a+b) );
               break;
            case 2: System.out.println("The substraction of the two numbers :" +(a-b));
                break;
            case 3: System.out.println("The multiplecations of the two numbers :" +(a*b));
                break;
            case 4: System.out.println("The division of the two numbers :" +(a/b));
                break;
        }


    }
}
