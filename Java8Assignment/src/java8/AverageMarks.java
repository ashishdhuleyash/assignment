package java8;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AverageMarks {
	 private static Scanner scanner;
	 
	    public static void main(String[] args) {
	 
	        System.out.println("Enter the number of marks to be averaged");
	 
	        scanner = new Scanner(System.in);
	 
	        int number = scanner.nextInt();
	 
	        int[] arr = new int[number];
	 
	        System.out.println("\nEnter numbers now\n");
	        for (int i = 0; i < number ;i++) {
	            System.out.println("Enter the marks" + (i + 1) + ":");
	            arr[i] = scanner.nextInt();
	        }
	 
	        IntStream streamOfNumbers = Arrays.stream(arr);
	 
	        OptionalDouble averageOfNumbers = streamOfNumbers.average();
	 
	        System.out.println("\nAverage of  marks: " + averageOfNumbers);
	 
	    }
	 
	 
	}


