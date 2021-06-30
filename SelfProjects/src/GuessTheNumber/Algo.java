package GuessTheNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Algo {

	Random random = new Random();

	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	int computerNumber;
	int userGuess;

	int tries = 0;

	List<Integer> listInput = new ArrayList<>();

	boolean win = false;

	public void run() {

		Scanner scanner = new Scanner(System.in);

		int formula = (100 / numbers.length);
		int percentage = 0;

		computerNumber = numbers[random.nextInt(numbers.length)];

		for (int i = 0; i < numbers.length; i++) {

			tries++;
			int result = percentage += formula;

			System.out.println("Chances of winning: " + result + "%");
			System.out.println("Please enter a number from 1-10: ");
			userGuess = scanner.nextInt();
			listInput.add(userGuess);

			System.out.println();

			System.out.println("You chose: " + userGuess);
			
			if (userGuess == computerNumber) {
				win = true;
				break;
			}

			for (Integer number : listInput) {
				System.out.println("User input so far: " + number);
			}
			
			
			System.out.println("\n");
		}

		scanner.close();
	}

	public void winner() {

		if (win) {

			System.out.println("\n");
			System.out.println("Computer chose: " + computerNumber);
			System.out.println("Congratulations, you won!");
			System.out.println("Number of attempts: " + tries);
		}

	}
}