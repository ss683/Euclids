package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first;
        int second;
        boolean goThru = true;

        while(goThru == true) {
            System.out.println("What are the two numbers that you want to find the GCD of? (i.e. 55 225)");
            try {
                first = input.nextInt();
                second = input.nextInt();
                goThru = false;
            }
            catch(InputMismatchException e) {
                System.out.println("You did not put in numbers. Try again.");
            }
        }

    }
}
