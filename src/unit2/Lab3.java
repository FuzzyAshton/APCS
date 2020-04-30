package unit2;

import java.util.Scanner;

public class Lab3 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		// 1
		/*
		int num; 
		do { 
			System.out.println("Please enter a positive integer: "); 
			num = getValidInt(); 
		} while (num < 2); // The first factor that is not one has to be less than the sqrt of the number // Starts by checking two 
		int i = 2;
		while (i <= Math.sqrt(num)) {
			if (num % i == 0) {
				System.out.println("That is not a prime. " + num + " is divisible by " + i);
				break; 
			} 
			i++; 
		} // If the loop never ran, the numbers sqrt was less than 2, so it would be // two, or three, which are all prime, because the input is validated to not be 1 System.out.println(num + " is a prime number");
		*/
		// 2
		/*
		int count = 6; // 6 is the first perfect number 
		int perfectNums = 0; 
		while (perfectNums < 4){ 
			int sumOfFactors = 0; 
			for (int i = 1; i < count; i++) { 
				// Check if a number is a factor 
				if (count % i == 0){ // If so, add it to the sum of factors: 
					sumOfFactors += i; 
				} 
			}
			// Check if the factors add to the number: 
			if (sumOfFactors == count) { // Then it is a perfect number
				perfectNums++; // Print the number 
				System.out.println(count); 
			} 
			count++; 
		}
		*/
		// 3
		/*
		int sum = 0;
		int startNumber;
		int elements;
		do {
			System.out.println("Please enter the start number: ");
			startNumber = getValidInt();
		} while (startNumber < 1);
		do {
			System.out.println("Please enter the number of elements: ");
			elements = getValidInt();
		} while (elements < 1);
		int count = 0;
		while (count < elements) {
			// Add the numbers after the start number
			sum += (startNumber + count);
			count++;
		}
		System.out.println("The sum is: " + sum);
		*/
		// 4
		/*
		int num;
		int sum = 0;
		// Ask for input until it is a valid integer
		System.out.println("Please enter a positive integer: ");
		num = getValidInt();
		// Do the same for negative numbers
		num = Math.abs(num);
		while (num > 0) {
			sum += num % 10; // Add the last digit to the sum
			num /= 10; // Remove the last digt from the number
		}
		System.out.println("The sum is: " + sum);
		*/
		// 5
		/*
		double count = 0.0; // Number of scores, 
		// make it a double for the last calculation
		int sum = 0; // Sum of scores
		int tempInput = 0;
		// A
		// do {
		// 	System.out.println("Enter a test score, or 0 to exit");
		// 	tempInput = getValidInt();
		// 	sum += tempInput;
		// 	// Make sure to not count another score if exited
		// 	if (!(tempInput == 0)){
		// 		count += 1.0;
		// 	}
		// } while (tempInput != 0);
		// B
		// while (true) {
		// 	System.out.println("Enter a test score, or -1 to exit");
		// 	tempInput = getValidInt();
		// 	// Exit when temp input is -1
		// 	if (tempInput == -1){
		// 		break;
		// 	}
		// 	sum += tempInput;
		// 	count += 1.0;
		// }
		// C
		// Run until the input is -1
		for (int i = 0; i < 1; i += 0){
			System.out.println("Enter a test score, or -1 to exit");
			tempInput = getValidInt();
			// Exit when temp input is -1
			if (tempInput == -1){
				break;
			}
			sum += tempInput;
			count += 1.0;
		}
		System.out.println("The average is: " + (sum / count));
		*/
		// 6
		/*
		int n = 11;
		// B
		for (int i = 0; i < n; i++) {
			System.out.print("|");
			// Print wires until the end
			if ((n - 1) - i > 0){
				// Print i + 1 number of wires
				for (int j = 0; j <= i; j++){
					System.out.print("=");
				}
			}
		}
		*/
		// Bonus
		int numPrimes = 0;
		// 2^3 - 1 is 3, the first mersenne prime with a perfect number
		int n = 2;
		while (numPrimes < 7) {
			int count = 2;
			// Max for int is 2^32 - 1, long needed
			long mersenneTest = (long) (Math.pow(2, n) - 1);
			boolean isPrime = true;
			// Test the potential mersenne prime (2^n) - 1, if not prime, 
			// it will have a factor at or before its square root
			while (count <= Math.sqrt(mersenneTest)){
				// Not prime
				if (mersenneTest % count == 0){
					isPrime = false;
					break;
				}
				count++;
			}
			if (isPrime) {
				// Then (2^(n-1))*(2^n-1) is a perfect number
				long mersennePrimePerfect = (long) (Math.pow(2, n - 1) * mersenneTest);
				System.out.println("Mersenne Prime: " + mersenneTest);
				System.out.println("Perfect number: " + mersennePrimePerfect);
				numPrimes++;
			}
			n++;
		}
	}

	/**
	 * Handle erronous input
	 * 
	 * @return a validated integer
	 */
	public static int getValidInt() {
		while (!in.hasNextInt()) {
			in.next();
		}
		return in.nextInt();
	}
}