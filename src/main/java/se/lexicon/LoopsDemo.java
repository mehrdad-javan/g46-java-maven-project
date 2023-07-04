package se.lexicon;

import java.util.Scanner;

public class LoopsDemo {

    // define a main method
    // psvm + tap
    public static void main(String[] args) {

        /*
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a valid operation:");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Addition Operation executes");
                    break;
                case 2:
                    System.exit(0);

                default:
                    System.out.println("Operation is not valid!");

            }

            System.out.println("-----------------");

        } */

        /*
        boolean isAdult = true;

        while (isAdult) {
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult!");
            } else {
                System.out.println("You are a child!");
                isAdult = false;
            }
        }
        System.out.println("Done!");*/

        /*
        int number = 5;
        do {
            number++; // 6
        } while (number != 0 && number < 5);

        System.out.println(number);  // 6
        */

        /*for( int i = 1; i <= 10  ; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }*/

        /*
        int row = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
         */

        /*
        int[] numbers = {11, 3, 14, 5, 6, 7, 9, 10}; // 14
        int max = 0;
        for (int number : numbers) {
            //System.out.println(number);
            if(number > max) {
                max = number; // 14
            }
        }

        System.out.println("Highest number is: " + max);
         */


        for( int i = 1; i <= 10  ; i++ ){
            if (i == 7) {
                continue;
            }
            if(i % 2 != 0){
                System.out.println(i);
            }

        }

        /*while (true) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + " Welcome to my app!");

            System.out.println("Do you want to continue (yes/no)?");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")){
                break;
            }
        }*/


    } // terminate the application


    public static void printMenu() {
        System.out.println("1. Addition");
        System.out.println("2. Exit");
    }


}
