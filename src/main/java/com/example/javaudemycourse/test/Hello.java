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


        //mini challenge - comparing variable to a numeric value
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        } else {
            System.out.println("This is an error");
        }


        //mini challenge - comparing variable to a boolean
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        } else {
            System.out.println("Dunno.");
        }


        //ternary operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This is domestic.");
        }

        //ternary operator example 2
        int ageOfClient = 16;
        String ageText = ageOfClient >= 18 ? "Over 18" : "Still a kid";
        System.out.println("Our client is " + ageText);














    }
}
