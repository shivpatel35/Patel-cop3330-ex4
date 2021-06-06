package org.ex4;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        //Input scanner declaration
        Scanner noun = new Scanner(System.in);
        Scanner verb = new Scanner(System.in);
        Scanner adj = new Scanner(System.in);
        Scanner adv = new Scanner(System.in);

        //Declaration of strings for noun,verb, adjective, and adverb
        String n;
        String v;
        String a;
        String av;


        //Asks for user input for each criteria
        System.out.println("Enter a noun: ");
        n = noun.nextLine();

        System.out.println("Enter a verb: ");
        v = verb.nextLine();

        System.out.println("Enter an adjective: ");
        a = adj.nextLine();

        System.out.println("Enter an adverb: ");
        av = adv.nextLine();

        //Prints out mad-lib statement including all strings from user input
        System.out.println("Do you " + v + " your " + a + " " + n + " " + av + "? That's hilarious!");




    }
}
