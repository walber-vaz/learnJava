package Conditions.InputUserScanner;

import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        /*
        * Usage Scanner class to get input from user
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (age < 18) {
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote and drive");
        }

        scanner.close();
    }
}
