package org.example;

public class Substraction implements OperationInterface{

    @Override
    public double operation(int a, int b) {

        System.out.println(" Substraction ");
        return a-b;
    }
}



