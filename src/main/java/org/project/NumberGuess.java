package org.project;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * This class is for a simple number guessing game which uses Binary Search algorithm
 * to arrive at the correct number.
 * 
 * @author rpundir
 */
public class NumberGuess {

    /**
     * Main method to run the program
     * 
     * @param args
     */
    public static void main(final String[] args) {
		System.out.println("Think a number between 0 and 100 and I will guess it for you!!!");
        
        // Binary search, start with the middle number
        int guess = 50;
        int higher = 100;
        int lower = 0;
        int attempts = 0;
        System.out.print("Is this the number - " + guess + "? (Please enter higher, lower, yes or end to end the game.):");
        
        try(Scanner keyboard = new Scanner(System.in)) 
        {
	        while (true) {
	            String input = keyboard.next();
	            if (StringUtils.isBlank(input)) {
	                System.out.println("Invalid input -> Null or blank.");
	                System.out.print("Usage -> Enter higher, lower, yes or end to end the game.");
	            } else if (StringUtils.equalsIgnoreCase(input, "yes")) {
	            	if(attempts==0) attempts++;
	                System.out.println("Found it in " + attempts + " attempts.");
	                break;
	            } else if (StringUtils.equalsIgnoreCase(input, "end")) {
	                System.out.println("Bye!!!");
	                break;
	            } else if (StringUtils.equalsIgnoreCase(input, "higher")) {
	            	attempts++;
	            	lower = guess + 1;
	            	guess = (lower + higher)/2;
		            System.out.print("Is this the number - " + guess + "? (Please enter higher, lower, yes or end to end the game.):");
	            } else if (StringUtils.equalsIgnoreCase(input, "lower")) {
	            	attempts++;
	            	higher = guess - 1;
	            	guess = (lower + higher)/2;
		            System.out.print("Is this the number - " + guess + "? (Please enter higher, lower, yes or end to end the game.):");
	            } else {
	                System.out.println("Invalid input !!!");
	                System.out.print("Usage -> Enter higher, lower, yes or end to end the game.");
	            }
	        }
        }
        
	}
}
