package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		System.out.println("Welcome to the Mars counter!");
		Scanner input = new Scanner(System.in);
		//grab earth weight

		System.out.println("Enter your earth weights separated by spaces:");
		String wEGrab = input.nextLine();
		//make an array

		String[] wEArray = wEGrab.split(" ");
		//convert to doubles & math

		for (int i = 0; i < wEArray.length; i++){
			double wEDouble = Double.parseDouble(wEArray[i]);
			double wMDouble = wEDouble * 0.378;
			System.out.format("%.2f lbs on earth, is %.2f lbs on mars\n", wEDouble ,wMDouble);
		}
		//return result

	}

}
