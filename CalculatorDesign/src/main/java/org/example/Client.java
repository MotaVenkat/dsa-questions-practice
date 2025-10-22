package org.example;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Please choose the operation....");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int number = scn.nextInt();
        OperationInterface operation= null;
        System.out.println("Please give the numbers ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        switch(number){
            case 1:
                operation= new Addition();
                System.out.println(operation.operation(a,b));
        }
    }
}
