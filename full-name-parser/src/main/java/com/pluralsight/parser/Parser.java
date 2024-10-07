package com.pluralsight.parser;


import java.util.Scanner;


public class Parser {

    public static void main(String[] args) {
        System.out.print("""
                 Please press one of the following:
                Type gC for full name (First, Middle, Last Names(s))
                or
                Type sN for shorter version (First, no Middle, Last Name)
                
                """);
        Scanner userInput = new Scanner(System.in);

        String gC;
        String sN;
        String choice;
        choice = userInput.nextLine();

        if (choice.equals("gC")) {
            System.out.println(" Please type in your First, Middle, and Last Name: ");
            gC = userInput.nextLine();
            String[] words = gC.split(" ");
            System.out.println("Your first name is: " + words[0]);
            System.out.println("Your middle name is: " + words[1]);
            System.out.println("Your last name is: " + words[2]);

        } else if (choice.equals("sN")) {
            System.out.println(" Please type in First and Last name: ");
            sN = userInput.nextLine();
            String[] words = sN.split(" ");
            System.out.println("Your first name is: " + words[0]);
            System.out.println("N/A");
            System.out.println("Your last name is: " + words[1]);
        }
    }
}
