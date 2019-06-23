package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        // 1
        SaySomething saySomething = new SaySomething();
        saySomething.say();
        // 2
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        // 3
        Processor processor1 = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text3.");
        processor1.execute(codeToExecute);
        // 4
        Processor processor2 = new Processor();
        processor2.execute(() -> System.out.println("This is an example text4."));

        // calculator
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        // Task 7.1
        System.out.println("\nTask 7.1"  );
        PoemBeautifier pB = new PoemBeautifier();


        pB.beautify("Text", (string) -> string + " ABC");
        pB.beautify("Text", (string) -> "ABC " + string);
        pB.beautify("Text", (string) ->"ABC " + string + " ABC");
        pB.beautify("Text", (string) -> string.toUpperCase());
        pB.beautify("aaaa", (string) -> {
                    String result;
                    result = string.toUpperCase();
                    return result.replace('A', 'B');
        });
        pB.beautify("Text Java8", (string) -> string.substring(5));
        pB.beautify("Java8", (string) -> string.concat(" is the best"));

        System.out.println();
        // 7.2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
