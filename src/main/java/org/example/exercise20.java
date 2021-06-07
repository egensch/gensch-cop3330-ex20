/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;

import java.util.Scanner;

public class exercise20
{
    public static void main(String[] args) {
        Scanner stateTax = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmt = stateTax.nextInt();

        System.out.print("What state do you live in? ");
        stateTax.nextLine();
        String state = stateTax.nextLine();

        if (state.equals("WI") || state.equals("Wisconsin"))
        {
            System.out.print("What county do you live in? ");
            String county = stateTax.nextLine();

            if (county.equals("Eau Claire"))
            {
                double tax = orderAmt * 0.055;
                System.out.printf("The tax is $%.2f.\n", tax);
                orderAmt = orderAmt + tax;
            }

            if (county.equals("Dunn"))
            {
                 double tax = orderAmt * 0.054;
                 System.out.printf("The tax is $%.2f.\n", tax);
                orderAmt = orderAmt + tax;
            }

            else
            {
                double tax = orderAmt * .05;
                System.out.printf("The tax is $%.2f.\n", tax);
                orderAmt = orderAmt + tax;
            }
        }
        if (state.equals("IL") || state.equals("Illinois"))
        {
            double tax = orderAmt * 0.08;
            System.out.printf("The tax is $%.2f.\n", tax);
            orderAmt = orderAmt + tax;
        }
        System.out.printf("The total is $%.2f.\n", orderAmt);
    }
}