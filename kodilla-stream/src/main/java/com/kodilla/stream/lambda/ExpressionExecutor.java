package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    public void executeExpression(double c, double d, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(c, d);
        System.out.println("Result equals: " + result);
    }
}
