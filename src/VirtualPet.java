
public class VirtualPet {

	// points
	private int hunger; // can this be public?
	private int weight;
	private int energy;
	private int accident;
	private int sleep;

	// constructors
	public VirtualPet(int hunger, int weight, int energy, int accident, int sleep) {
		this.hunger = hunger;
		this.weight = weight;
		this.energy = energy;
		this.accident = accident;
		this.sleep = sleep;
	}

	// getters
	// public int getHunger() {
	// return hunger;
	// }

	public int getWeight() {
		return weight;
	}

	public int getEnergy() {
		return energy;
	}

	public int getAccident() {
		return accident;
	}

	public int getSleep() {
		return sleep;
	}

	// setters
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setAccident(int accident) {
		this.accident = accident;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	// methods

	public void tick() {
		hunger += 1; // gets hungrier every loop
		weight -= 1; // loses weight every loop
		energy -= 1; // loses energy every loop
		accident += 1; // likelihood of accident increases each loop
		sleep += 1; // more tired each loop

		if (accident >= 10) {
			accident *= 0;
			System.out.println("Pup had an accident :(  couldn't hold it any longer!");
		}
	}

	public void feed() {
		hunger -= 2; // less hungry
		weight += 2; // +1 lb.
		energy += 1; // gain energy
		accident += 1; // more likely to have an accident
	}

	public void play() {
		hunger += 2;
		weight -= 2;
		energy -= 2;
		accident -= 1;
		sleep += 2;
	}

	public void takeOut() {
		hunger += 1;
		weight -= 1;
		accident = 0;

		// if (accident >=10) {
		// accident *= 0;
		// System.out.println("Pup had an accident :( couldn't hold it any longer!");
		// }
	}

	public void sleep() {
		hunger += 1;
		weight += 1;
		energy += 1;
		sleep -= 2;
	}

	public void doNothing() {
		hunger += 1;
		weight += 1;
		energy += 1;
		accident += 1;
		sleep -= 1;
	}

	public void care() {
		System.out.println("\nPress 1 to feed your pup." + "\nPress 2 to play with your pup."
				+ "\nPress 3 to take your pup out to do their business." + "\nPress 4 if it's time to sleep!"
				+ "\nPress 5 to do nothing." + "\nType \"exit\" to exit.");
	}

	public void currentHealth() {
		System.out.println("\nCurrent Hunger: " + hunger + "\nCurrent Weight: " + weight + "\nCurrent Energy Level: "
				+ energy + "\nLikelihood of an Accident: " + accident + "\nSleepiness: " + sleep);
	}

	// @override

}