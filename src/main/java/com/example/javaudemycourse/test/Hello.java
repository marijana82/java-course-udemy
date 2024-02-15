package com.example.javaudemycourse.test;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Marijana.");

        boolean isAlien = true;

        if(!isAlien) {
            System.out.println("Hello Marijana.");
        } else {
            System.out.println("Hello Alien");
        }


        //operands
        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("No high score.");
        }

        //logical && (AND) operator
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }


        //logical OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        } else {
            System.out.println("Not true");
        }


        //mini challenge





    }
}
