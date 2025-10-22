package org.example;

public class Addition implements OperationInterface{
    @Override
    public double operation(int a, int b) {

        System.out.println(" Addition ");
        return a+b;
    }
}
