package com.ninja.demo;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		 
		Random random = new Random();	//random number method
		
		int secretNumber = random.nextInt(100)+1; //+1 because its start from zero
		
		int attempts = 0;
		
		int max_attempts = 10;
		
		System.out.println("Welcome to the Number Guessing Game! You have " + max_attempts + " attempts to guess the number.");
		
		while(attempts<max_attempts) {
			
			System.out.println("Enter your guess number between 1-100: ");
			
			int userNumber = sc.nextInt();	//Taking a number from user
			
			attempts++;
			
			if(userNumber<secretNumber) {
				
				System.out.println("Too low! Try again.");
			}
			else if (userNumber>secretNumber) {
				
				System.out.println("Too high! Try again.");
			}
			else {
				
				System.out.println("Congratulations! You've guessed the number: "+secretNumber+ " in "+attempts+" attemps.");
				break;
			}
			
			int left;
			System.out.println("Attempts left are "+(left =max_attempts-attempts));
			
		}
		
		
		
		
	}

}
