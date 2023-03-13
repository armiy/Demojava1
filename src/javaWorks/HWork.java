package javaWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HWork {
    public static void sumOfNumbers() {
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.print(i + "+");
        }
        System.out.println("=" + sum);
    }

    public static void printNumbersTriangle() {
        //To print the numbers in a triangle.
        // 1. print them in one column 1 to 5 then print a space that starts from 5 to 1 decreasing then print the numbers
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            System.out.println();
            for (j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public void printDecreasingAndIncreasingNumbersTriangle() {
        // printing 2 number patterns - in a triangle & inverted triangle side by side
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            System.out.println();
            for (j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
        }
    }

    public void printNumbersInvertedTriangle() {
        // print numbers in inverted triangle
        int i, j, n = 5;
        for (i = n; i >= 1; i--) {
            System.out.println();
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }

        }
    }

    public static void febnoacci() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }


    public void maxMin() {
        int[] arr = {2, 6, 1, 45, 10, 12, 23, 54};
        int max = arr[2];
        int min = arr[2];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The maximum number is " + max + " and " + "The minimum is " + min);

    }

    public static void moreNumberPattern() {
        // printing in decreasing pattern triangle
        int i, j, n = 5;
        for (i = n; i >= 1; i--) {
            System.out.println();
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
        }
        for (i = 1; i <= 5; i++) {
            System.out.println();
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
        }

    }

    public void sumOfNumbersInArray() {
        int[] arr = {1, 3, 5, 6, 78, 56, 23, 5};
        int i, j, sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i]);
            if (i < arr.length) {
                System.out.print("+");
            }
        }
        System.out.println("= " + sum);
    }

    public static void divisor() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number and I will give you its divisor\n");
        int num = input.nextInt();
        ArrayList<Integer> lis = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                lis.add(i);
            }
        }
        System.out.println("The divisor of " + num + " are " + lis);
    }

    public static void main(String[] args) {
        sumOfNumbers();
        HWork obj1 = new HWork();
        obj1.printDecreasingAndIncreasingNumbersTriangle();
        System.out.println(); // printing space between functions/methods

        obj1.printNumbersInvertedTriangle();

        System.out.println();// printing space between functions/methods
        printNumbersTriangle();

        System.out.println();// printing space between functions/methods
        febnoacci();

        System.out.println();//printing space between methods
        obj1.maxMin();
        moreNumberPattern();
        System.out.println();
        obj1.sumOfNumbersInArray();
        divisor();
        userArrayInput();
        twoDArray();


        }


    public static void userArrayInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int size = input.nextInt();
        int arr [] = new int[size];
        System.out.println("please enter list of numbers between spaces you want to add in your array");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();// set up the limit of integer you accept by i (i from 0 to arr.length or size.
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void twoDArray(){
        System.out.println("The following numbers are printed as an iterated elements of a 2-dimensional array using nested for loop");
        int [][] array2d = {{1,4,3},{8,5,6},{7,10,19}};
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d[i].length;j++){
                System.out.print(array2d[i][j]+" ");

           }
        }
    }

}





