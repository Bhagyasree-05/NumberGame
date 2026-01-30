package main;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame { // ONLY this class here
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(10) + 1; 
        int guess;

        System.out.println("Guess a number between 1 and 10");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You won 🎉");
            }
        } while (guess != number);

        sc.close();
    }
}
