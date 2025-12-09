package lexicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExercises {

    void main() {

        printNumbers(); //Exercise 1

        indexOF(); //Exercise 2: Find the index of a number.

        sortStringArray(); //Exercise 3

        copyOfElements();  //Exercise 4

        twoDimensionalArray();  //Exercise 5
    }

    /*
    This method will Print the numbers in the array.
     */
    void printNumbers() {
        int[] numbers = new int[]{11, 23, 39, 94, 46};
        System.out.println("The numbers in the array are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /*
    This method used to find the index of the user entered number.
    If the number is not found, it will return -1 along with the message.
     */
    void indexOF() {

        int[] numbers1 = new int[]{12, 23, 34, 45, 56, 67};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find it's index: ");
        int userInput = scan.nextInt();
        boolean isFound = false;
        for (int i = 0; i < numbers1.length; i++) {
            if (userInput == numbers1[i]) {
                System.out.println("Index position of number " + numbers1[i] + " is: " + i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Number not found: -1");
        }
    }

    /*
    This method will print the sorted way of Strings.
     */
    void sortStringArray() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("New York");
        cities.add("Stockholm");
        //String[] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("String Array: " + cities);
        Collections.sort(cities);
        System.out.println("Sorted String Array: " +cities);
    }

    /*
    This method will copy the elements from one array to another array.
     */
    void copyOfElements() {
        int[] num1 = new int[]{1, 15, 20, 68};
        int[] num2 = new int[4];
        for (int i=0; i<num1.length; i++) {
            num2[i] = num1[i];
        }
        System.out.println("Elements from first array: ");
        for(int i : num1) {
            System.out.println(i);
        }
        System.out.println("Elements from second array: ");
        for(int i : num2) {
            System.out.println(i);
        }
    }

    /*
    This method will print the two-dimensional array of country and city.
     */
    void twoDimensionalArray() {
        String[][] twoDimArray = {{"France", "Paris"},{"Sweden", "Stockholm"}};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}