package com.pluralsight.librarybooks;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String decide;

        System.out.println("Type KNOWLEDGE!! to proceed. ");
        boolean incorrect_password = true;
        while (incorrect_password) {

            decide = userInput.nextLine();


            if (decide.equals("KNOWLEDGE!!")) {
                incorrect_password = false;
                //password while loop breaks
                //Prints out prompt for userInput
                boolean display_choices = true;
                while (display_choices) {
                    System.out.print("""    
                            ================================================================
                            
                                   Welcome to the Library of Unforgettable Knowledge
                            
                            ================================================================
                            Please select one of the options below to go forward on your adventure!
                            
                            Type 1 to see our books that are available.
                            Type 2 to see any of the books currently out on an adventure.
                            Type 3 to exit the library and end your adventure.
                            """);


                    decide = userInput.nextLine();
                    //if user wants to check out a book
                    if (decide.equals("1")) {
                        System.out.println("Glad you want to continue forward for an adventure, here's what's available to be explored. Please pick one that you'll like. ");
                        //to-do Show the books with ID, title, and isbn

                        System.out.println("Press Enter to return to the menu. ");
                        userInput.nextLine();
                    }
                    //if user wants to see what books are out and who has them
                    else if (decide.equals("2")) {
                        System.out.println("My, my traveler. It seems other explorers have come and taken the knowledge you seek. Here are the books and their caretakers: ");
                        //to-do list people with the books checked out

                        System.out.println("Press Enter to return to the menu. ");
                        userInput.nextLine();

                        //user decides to close the program
                    } else if (decide.equals("3")) {
                        display_choices = false;
                        System.out.println("Thank you, your adventure has now ended");

                    } else {
                        System.out.println("Please input a number provided traveler. Like 1, 2, or 3 perhaps? ");
                    }
                }

            } else { //if incorrect password
                System.out.println("Unfortunately traveler, that is the incorrect password to this realm. Lets try again shall we? ");
            }
        }

        //Book b = new Book("HunchBack of Notre Dame", "20");

        //{
        //System.out.println(b);
        //System.out.println(Book.getTitle(b));
        //}

    }
}

