package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calc = new Calculator();

        if(calc.add(9,6) == 17 ) {
            System.out.println("well done");
        }else {
            System.out.println("failure");
        }

        if(calc.subtract(10, 5) == 5){
            System.out.println("well done");
        }else {
            System.out.println("failure");
        }

    }


}