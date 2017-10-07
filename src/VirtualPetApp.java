import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet dog = new VirtualPet(1, 70, 10, 0, 1);

		String choice;

		System.out.println("What would you like to do?");

		do {
			dog.care();
			choice = input.nextLine().toLowerCase();
			dog.tick();

			if (choice.equals("exit")) {
				System.out.println("Final Health");
				dog.currentHealth();
				System.out.println("\n\nThanks for playing.  See you next time!");
				System.exit(0);

			} else if (choice.equals("1")) {
				// dog.tick();
				dog.feed();
				System.out.println("Thanks for the food and water!");
				dog.currentHealth();

			} else if (choice.equals("2")) {
				dog.play();
				System.out.println("I ruv to play.  That was so much fun!");
				dog.currentHealth();

			} else if (choice.equals("3")) {
				dog.takeOut();
				System.out.println("Potty break!");
				dog.currentHealth();

			} else if (choice.equals("4")) {
				dog.sleep();
				System.out.println("Time to sleep!");
				dog.currentHealth();

			} else if (choice.equals("5")) {
				dog.doNothing();
				System.out.println("You did nothing...");
				dog.currentHealth();

			} else {
				System.out.println("Invalid option, try again.");
				dog.currentHealth();
				choice = input.nextLine();

			} // closes final "else"

			System.out.println("\nWhat would you like to do next?");
			// String s2 = input.nextLine();

		} // closes "do"

		while (!choice.equals("exit"));

		System.out.println("Thanks for playing!");
		System.exit(0);

	}

}
