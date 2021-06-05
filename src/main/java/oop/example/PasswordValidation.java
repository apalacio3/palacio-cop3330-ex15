/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class PasswordValidation
{
    public static void main( String[] args )
    {
        System.out.print("What is the username? ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        System.out.print("What is the password? ");
        String password = input.nextLine();

        String un = "DifoLover42";
        String pw = "!Difo2021";

        if(username.equals(un) && password.equals(pw))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
