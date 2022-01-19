/*  -------------------- Program Information --------------------
    Name Of Program: EvenArray.java
    Date of Creation: 1/14/22
    Name of Author(s): Brady Butcher
    Version of Java: jdk-17
    Created with: Visual Studio Code
    Program Description: A method that fills an array with random even numbers. 
        Prompts for the number of elements in the array and the range of the random numbers 
        (0 – number inclusive).
    -------------------- Program Information --------------------  */

import java.util.*;

public class EvenArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int number = Integer.parseInt(scan.nextLine());

        int[] evenNumbers = new int[number]; // creates a new array with n elements
        int min = 0;
        int max = 100;
        int randomNumber;

        for (int i = 0; i < evenNumbers.length; i++) {
            randomNumber = min + (int) (Math.random() * (max - min));

            if (randomNumber % 2 == 1 || randomNumber == 0) {
                while (randomNumber % 2 == 1 || randomNumber == 0) {
                    randomNumber = min + (int) (Math.random() * (max - min));
                }
            }

            evenNumbers[i] = randomNumber;
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(i + " " + evenNumbers[i]);
        }

        scan.close();
    }
}