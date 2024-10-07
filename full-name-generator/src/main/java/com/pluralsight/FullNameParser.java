package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter name in the prompts provided");

        System.out.println("What is your first name?: ");
        firstName = userInput.nextLine();

        System.out.println("What is your middle name if you have one?: ");
        middleName = userInput.nextLine();

        System.out.println("And what is your last name?: ");
        lastName = userInput.nextLine();

        String fullname;
        fullname = (firstName + " " + middleName + " " + lastName + " ");

        System.out.println("The name you have entered is: " + fullname);

    }
}
