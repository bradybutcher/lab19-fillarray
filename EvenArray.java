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

public class EvenArray {

    public static void main(String[] args) {
        int[] evenNumbers = new int[10]; // creates a new array with 10 elements
        int min = 2;
        int max = 100;
        int randomNumber = min + (int) (Math.random() * (max - min)); // formula to generate random number between min
                                                                      // and max

        while (randomNumber % 2 == 0) {
            evenNumbers[0] = randomNumber;
            evenNumbers[1] = randomNumber;
            evenNumbers[2] = randomNumber;
            evenNumbers[3] = randomNumber;
            evenNumbers[4] = randomNumber;
            evenNumbers[5] = randomNumber;
            evenNumbers[6] = randomNumber;
            evenNumbers[7] = randomNumber;
            evenNumbers[8] = randomNumber;
            evenNumbers[9] = randomNumber;
        }

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println(i + " " + evenNumbers[i]);
        }
    }
}