import java.util.Scanner;

public class CodingProjectWeek04 {

	public static void main(String[] args) {

		/**
		 * 1. Create an Array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93. a. Programmatically subtract the value of the first
		 * element in the Array from the value in the last element of the Array (i.e. do
		 * not use ages[7] in your code). Print the result to the console. b. Create a
		 * new array of int called ages2 with 9 elements (ages2 will be longer than the
		 * ages array, and have more elements). i. Make sure that there are 9 elements
		 * of type int in this new array. ii. Repeat the subtraction from Step 1.a.
		 * (Programmatically subtract the value of the first element in the new array
		 * ages2 from the last element of ages2). iii. Show that using the index values
		 * for the elements is dynamic (works for arrays of different lengths). c. Use a
		 * loop to iterate through the Array and calculate the average age. Print the
		 * result to the console.
		 */

		System.out.println("*****Question #1*****");

		// initialize integer array "ages"
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

		// find the difference between the first and last element
		int difference = ages[ages.length - ages.length] - ages[ages.length - 1];

		// print the results
		System.out.println("The difference between the first and last elements in the ages array is: " + difference);

		// initialize a new array of type int, but it has 9 elements
		int[] ages2 = { 19, 6, 44, 66, 27, 35, 12, 54, 3 };

		// find the difference using the same method as above but for the new array
		difference = ages2[ages2.length - ages2.length] - ages2[ages2.length - 1];

		System.out.println("The difference between the first and last elements in the ages2 array is: " + difference);

		// declare variable to hold the average age and temporary sum of all age values
		// from both arrays
		// declare agesCnt and agesCnt2 to be used as counters for each loop and made
		// accessible outside the scope of "for"
		int avgAges = 0, avgAges2 = 0, tempSumAges = 0, tempSumAges2 = 0, agesCnt = 0, agesCnt2 = 0;

		// iterate through each array individually to calculate and store the average
		// age
		for (; agesCnt < ages.length; agesCnt++) {
			tempSumAges += ages[agesCnt];
		}

		for (; agesCnt2 < ages2.length; agesCnt2++) {
			tempSumAges2 += ages2[agesCnt2];
		}

		avgAges = tempSumAges / agesCnt;
		avgAges2 = tempSumAges2 / agesCnt2;

		System.out.println("The average age of the ages array is: " + avgAges);
		System.out.println("The average age of the ages2 array is: " + avgAges2);

		/**
		 * 2. Create an Array of String called names that contains the following values:
		 * “Sam”, “Tommy”, "Tim”, “Sally”, “Buck”, “Bob”. a. Use a loop to iterate
		 * through the Array and calculate the average number of letters per name. Print
		 * the result to the console. b. Use a loop to iterate through the Array again
		 * and concatenate all the names together, separated by spaces, and print the
		 * result to the console.
		 */

		System.out.println("\n*****Question #2*****");

		// initialize an array of String names
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// variable declaration for loop counter, total number of characters, and
		// average name length total
		int nameCnt = 0, sumNameLength = 0, avgNameLength = 0;

		// iterate through the names array to obtain a total number of characters
		for (; nameCnt < names.length; nameCnt++) {
			sumNameLength += names[nameCnt].length();
		}

		// find the average number of characters based on the number of elements
		avgNameLength = sumNameLength / nameCnt;

		System.out.println("The average number of letters per name is: " + avgNameLength);

		String concatNames = "";

		for (int i = 0; i < names.length; i++) {
			if (i == 0) {
				concatNames += names[i];
			} else {
				concatNames += " " + names[i];
			}
		}

		System.out.println("All of the names concatenated togerther is: " + concatNames);

		/**
		 * 3. How do you access the last element of any Array?
		 */

		System.out.println("\n*****Question #3*****");

		System.out.println(
				"To access the last element of the Array you must first find out its length. Since index indicating the elements of an Array starts with the number 0 and increments by 1 from there, "
						+ "you can use the length minus 1 to access the last element as the index of the Array.");
		System.out.println(
				"For example: If an Array contains 3 elements, its values are stored in index 0, 1, and 2 respectively. In order to access"
						+ " the last element, you can subtract 1 from the length when entering the index value. (ie:v_array[v_array.length - 1])");

		int[] q3Array = { 11, 22, 33 };
		int arrLength = q3Array.length;
		System.out.println("The last element of q3Array is: " + q3Array[arrLength - 1]);

		/**
		 * 4. How do you access the first element of any Array?
		 */

		System.out.println("\n*****Question #4*****");

		System.out.println("To access the first element of the Array you can use 0 as the index.");
		System.out.println("An Array of length 1 or greater will always have its first value stored in index 0.");

		int[] q4Array = { 11, 22, 33 };
		System.out.println("The first element of q4Array is: " + q4Array[0]);

		/**
		 * 5. Create a new Array of int called nameLengths. Write a loop to iterate over
		 * the previously created names Array and add the length of each name to the
		 * nameLengths Array.
		 */

		System.out.println("\n*****Question #5*****");

		int[] nameLengths = new int[names.length];

		System.out.println("The length of each name in the names Array is: ");
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(i + ": " + nameLengths[i]);
		}

		/**
		 * 6. Write a loop to iterate over the nameLengths Array and calculate the sum
		 * of all the elements in the Array. Print the result to the console.
		 */

		System.out.println("\n*****Question #6*****");

		int totalLengths = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			totalLengths += nameLengths[i];
		}

		System.out.println("The sum of all elements in the nameLengths Array is: " + totalLengths);

		/**
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */

		System.out.println("\n*****Question #7*****");

		Scanner sc = new Scanner(System.in);

		System.out.print("Please type a word that will be used for concatenation: ");
		String word = sc.nextLine();

		if (word.length() == 0) {
			System.out.println();
			do {
				System.out.print("Invalid input. Please type word that is at least 1 character in length: ");
				word = sc.nextLine();
			} while (word.length() == 0);
		}

		System.out.print("\nPlease enter the number of times it will be concatenated (1-10): ");
		int n = sc.nextInt();

		if (!(n >= 1 && n <= 10)) {
			System.out.println();
			do {
				System.out.print("Invalid input. Please enter a number between 1 and 10: ");
				n = sc.nextInt();
			} while (!(n >= 1 && n <= 10));
		}

		System.out.println("\nResult: " + concatenatedWord(word, n));

		/**
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */

		System.out.println("\n*****Question #8*****");

		sc.nextLine();

		System.out.print("Please enter a first name: ");
		String firstName = sc.nextLine();

		if (firstName.length() == 0) {
			System.out.println();
			do {
				System.out.print("Invalid input. Please enter a first name: ");
				firstName = sc.nextLine();
			} while (firstName.length() == 0);
		}

		System.out.print("\nPlease enter a last name: ");
		String lastName = sc.nextLine();

		if (lastName.length() == 0) {
			System.out.println();
			do {
				System.out.print("Invalid input. Please enter a last name: ");
				lastName = sc.nextLine();
			} while (lastName.length() == 0);
		}

		System.out.println("\nThe full name is: " + fullName(firstName, lastName));

		/**
		 * 9. Write a method that takes an Array of int and returns true if the sum of
		 * all the ints in the Array is greater than 100.
		 */

		System.out.println("\n*****Question #9*****");

		int[] numsArr1 = { 22, 41, 7, 38 }, numsArr2 = { 42, 7, -8, 3 };

		Boolean isGreater100 = addArrayValues(numsArr1);
		sum100CheckPrintout(isGreater100, numsArr1);

		isGreater100 = addArrayValues(numsArr2);
		sum100CheckPrintout(isGreater100, numsArr2);

		/**
		 * 10. Write a method that takes an Array of double and returns the average of
		 * all the elements in the Array.
		 */

		System.out.println("\n*****Question #10*****");

		double[] arrDouble = { 3.14, 2.88, 19.23 };
		System.out.println("arrDouble values: 3.14, 2.88, 19.23");

		double avgArrDbl = doubleArrayAverage(arrDouble);

		System.out.printf("The average of all elements in arrDouble is: %.2f\n", avgArrDbl);

		/**
		 * 11. Write a method that takes two Arrays of double and returns true if the
		 * average of the elements in the first Array is greater than the average of the
		 * elements in the second Array
		 */

		System.out.println("\n*****Question #11*****");

		double[] arrDouble2 = { 9.55, 4.73, 10.4, 8.02, 23.44 };

		System.out.println("The first Array of double values: 3.14, 2.88, 19.23");
		System.out.println("The second Array of double values: 9.55, 4.73, 10.4, 8.02, 23.44");

		Boolean isGreaterDouble = doubleArrayAvgCheck(arrDouble, arrDouble2);

		if (isGreaterDouble) {
			System.out.println(
					"\nThe average value of the first array IS greater than the average value of the second array.");
		} else {
			System.out.println(
					"\nThe average value of the first array IS NOT greater than the average value of the second array.");
		}

		/**
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		 * a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */

		System.out.println("\n*****Question #12*****");
		boolean isHotOutside = false;
		double moneyInPocket = 0.0;

		System.out.print("Is it hot outside today (Y/N)? ");
		String hotAnswer = sc.next();

		if (!(hotAnswer.equalsIgnoreCase("y")) && !(hotAnswer.equalsIgnoreCase("n"))) {
			System.out.println();
			do {
				System.out.print("Invalid input. Is it hot outside today (Y/N)? ");
				hotAnswer = sc.next();
			} while (!(hotAnswer.equalsIgnoreCase("y")) && !(hotAnswer.equalsIgnoreCase("n")));
		}

		if (hotAnswer.equalsIgnoreCase("y")) {
			isHotOutside = true;
		} else if (hotAnswer.equalsIgnoreCase("n")) {
			isHotOutside = false;
		}

		System.out.print("\nHow much money do you have in your pocket? ");
		moneyInPocket = sc.nextDouble();

		Boolean isBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);

		if (isBuyDrink) {
			System.out.println("You should buy a drink today.");
		} else if (!isBuyDrink && moneyInPocket < 10.5 && !isHotOutside) {
			System.out.println("It is not hot enough and you do not have enough money to buy a drink");
		} else if (!isBuyDrink && moneyInPocket > 10.5 && !isHotOutside) {
			System.out.println("It is not hot enough outside to buy a drink.");
		} else {
			System.out.println("You do not have enough money to buy a drink.");
		}

		/**
		 * 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 */

		System.out.println("\n*****Question #13*****");

		double moneySaved = 0.0, costToBuy = 0.0;

		System.out.println("How much money do you have saved?");
		moneySaved = sc.nextDouble();

		System.out.println("How much money does the pizza cost?");
		costToBuy = sc.nextDouble();

		Boolean isAffordable = pizzaPartyPrice(moneySaved, costToBuy);

		if (isAffordable) {
			System.out.println("You can buy the pizza. Enjoy!");
		} else {
			System.out.println("You do not have enough money saved. Maybe another day.");
		}
	}

	private static String concatenatedWord(String word, int n) {
		String tempWord = "";

		for (int i = 0; i < n; i++) {
			tempWord += word;
		}

		return tempWord;
	}

	private static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	private static Boolean addArrayValues(int[] numsArr) {
		int total = 0;

		for (int i = 0; i < numsArr.length; i++) {
			total += numsArr[i];
		}

		if (total > 100) {
			return true;
		} else {
			return false;
		}
	}

	private static void sum100CheckPrintout(Boolean isGreater100, int[] numsArr) {
		System.out.print("The values in the Array (");

		for (int i = 0; i < numsArr.length; i++) {
			if (i == (numsArr.length - 1)) {
				System.out.print(numsArr[i]);
			} else {
				System.out.print(numsArr[i] + ", ");
			}
		}

		if (isGreater100) {
			System.out.println(") is greater than 100!");
		} else {
			System.out.println(") are not greater than 100!");
		}
	}

	private static double doubleArrayAverage(double[] arrDouble) {
		double tempSum = 0.0, avg = 0.0;
		int count = 0;

		for (double value : arrDouble) {
			tempSum += value;
			count++;
		}

		avg = tempSum / count;

		return avg;
	}

	private static Boolean doubleArrayAvgCheck(double[] arrDouble, double[] arrDouble2) {
		double tempSum1 = 0.0, tempSum2 = 0.0, avg1 = 0.0, avg2 = 0.0;
		int count1 = 0, count2 = 0;

		for (double value : arrDouble) {
			tempSum1 += value;
			count1++;
		}

		for (double value2 : arrDouble2) {
			tempSum2 += value2;
			count2++;
		}

		avg1 = tempSum1 / count1;
		avg2 = tempSum2 / count2;

		if (avg1 > avg2) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean pizzaPartyPrice(double moneySaved, double costToBuy) {
		if (moneySaved >= costToBuy) {
			return true;
		} else {
			return false;
		}
	}

}
