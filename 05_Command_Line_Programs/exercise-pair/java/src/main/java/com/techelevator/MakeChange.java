package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		System.out.println("Welcome to change maker.");
		//Grabs price

			System.out.println("Please enter the bill price.");
			Scanner input = new Scanner(System.in);
			String startingBill = input.nextLine();
			// grab amount tendered

			System.out.println("Enter amount paid.");
			String amountTendered = input.nextLine();

			double total = 0.0;
			double startingBillDouble = Double.parseDouble(startingBill);
			double amountTenderedDouble = Double.parseDouble(amountTendered);

			//Math price and amount given
			double change = amountTenderedDouble - startingBillDouble;
			System.out.format(" Your amount of change owed is $%.2f", change);


		//print results
	}

}
