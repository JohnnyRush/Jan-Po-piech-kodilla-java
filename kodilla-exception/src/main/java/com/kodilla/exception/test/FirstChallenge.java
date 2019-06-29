package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result;
        try {
            result = firstChallenge.divide(3, 0);
            System.out.println("Result: " + result );
        }catch (ArithmeticException a){
            System.out.println("Divide by 0 is forbidden: " + a );
        }finally {
            System.out.println("Calculator finished work.");
        }
    }
}