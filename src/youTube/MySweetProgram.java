package youTube;

import java.util.Arrays;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		
		// loopPractice();
		// pyramidLoop();
		// whileLoopStuff();
		// arrayYays();
		// arraySearch();
		twoDimArrays();
		
	}
	
	private static void twoDimArrays() {
		
		//2D Arrays are like a grid - access using row x col [][]
		int[][] grades = {
				{80, 95, 99},
				{75, 78, 88},
				{100, 89, 93},
		};
		
		System.out.println(grades[2][2]);
		System.out.println(Arrays.deepToString(grades));
		
		//Iterating through a 2D array
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[row].length; col++) {
				System.out.print(grades[row][col] + " ");
			}
		System.out.println();
		} 
	}

	private static void arraySearch() {
		
		//Searching an array for a value - using a loop
		int[] grades = {1, 6, 34, 43, 5, 6006, 7, 18, 9};
		System.out.println("Before: " + Arrays.toString(grades));
		
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] == 5) {
				System.out.println("Found it! Found at index: " + i);
			}	
		}
		
		//Sorting an array using sort or parallelSort
		Arrays.sort(grades);
		System.out.println("\nHere is your sorted list of grades!");
		System.out.println("Afer: " + Arrays.toString(grades));
		
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] == 5) {
				System.out.println("Found it! Found at index: " + i);
			}
		}
		
		//Comparing two Arrays
		int[] grades1 = {80, 67, 46, 99, 100};
		int[] grades2 = {80, 67, 46, 99, 100};
		if (Arrays.equals(grades1, grades2)) {
			System.out.println("Same");			
		}
		
		Scanner sc = new Scanner(System.in);
		//Filling an array with same value
		System.out.println("Enter the size of your array: ");
		int size2 = sc.nextInt();
		int[] grades3 = new int[size2];
		System.out.println("Now enter the vaule: ");
		int value = sc.nextInt();
		Arrays.fill(grades3, value);
		System.out.println(Arrays.toString(grades3));
		sc.close();
	}

	public static void arrayYays() {
		//How to print an array without a loop:
		//Use object Arrays.toString to print array values
		int[] grades = {10,4,6,8,19,24,73,3,55,19};
		System.out.println(Arrays.toString(grades));
		
		//deepToString to print arrays with arrays
		int[][] ages = {{3,5,7,19},{5,89,4,2,123}};
		System.out.println("\n" + Arrays.deepToString(ages));
		
		//How to print an array WITH a loop:
		//Printing the array using a for loop - using Scanner to fill the array and determine array size
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the size of your list");
		int size = sc.nextInt();
		int[] hits = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter a number");
			hits[i] = sc.nextInt(); 
			System.out.println(Arrays.toString(hits));
		}
		System.out.println("\nYour list is now full");
		System.out.println(Arrays.toString(hits));
		System.out.println("Thank you for playing friend!");
	}
		
	public static void whileLoopStuff() {
		int i = 9; 
		while (i >= 0) {
			int k = i;
			while (k >= 0) {
				System.out.print("* ");
				k--;
			}
			System.out.println();
			i--;
		}
	}
	
	public static void pyramidLoop() {
		
		
		for (int x = 1; x < 6; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*  ");				
			}
			System.out.println();
		}
		for (int i = 1; i <= 6; i++) {
			for(int j = i; j <= 6; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}		
	}
		
	private static void loopPractice() {
		for (int i = 0; i<10; i++) {
			System.out.print(i);
			switch (i) {
			case 0:
				System.out.println("\nAll truth is circumscribed into one great whole");
				break;
			case 1:
				System.out.println("\nOne for the money");
				break;
			case 2:
				System.out.println("\nTwo for the show");
				break;
			case 3:
				System.out.println("\nThree for the Godhead");
				break;
			default:
				System.out.println("wow");
				}
		} 	
		System.out.println("");
		for (int c = 10; c>=0; c--) {
			System.out.print(c);
		}
		System.out.println("");		
		for (int u = 0; u<=16; u++) {
			System.out.print(u);
		}
	}
}
