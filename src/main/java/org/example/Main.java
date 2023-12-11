package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        int keyPressed = 0;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            int key = scanner.nextInt();

            System.out.println("Enter direction:");


            int right = 6;
            int left = 4;

            if(key == right) {
                keyPressed++;
                scanner.nextLine();
            }
            if(key == left) {
                keyPressed--;
                scanner.nextLine();

            }
            System.out.println(keyPressed+" keypressed");
            new Board().newBoard(keyPressed);
        }

    }
}