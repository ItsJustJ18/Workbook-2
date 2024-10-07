package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter name in the prompts provided");

        System.out.print("What is your first name?: ");
        firstName = userInput.nextLine();

        System.out.print("What is your middle name if you have one?: ");
        middleName = userInput.nextLine();

        System.out.print("And what is your last name?: ");
        lastName = userInput.nextLine();

        System.out.print("Also do you have a suffix?: ");
        suffix = userInput.nextLine();

        String fullname;
        fullname = (firstName + " " + middleName + " " + lastName + " " + suffix);

        System.out.println("The name you have entered is: " + fullname);

    }
}
