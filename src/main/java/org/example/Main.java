package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Tbilisi";

        String question = "What is the capital of Georgia?";
        System.out.println(question);

        String userAnswer = scanner.nextLine();

        while (userAnswer != answer) {
            System.out.println("Not correct, " + "\n"+question);
            userAnswer = scanner.nextLine();
        }
    }
}