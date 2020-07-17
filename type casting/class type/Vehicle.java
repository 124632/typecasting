class Vehicle {
	String name;
	String regNum;
	long chasisNum;

	void start() {
		System.out.println(" vehicle started...");
	}

	void stop() {
		System.out.println(" vehicle stopped...");
	}

	void drive() {
		System.out.println(" Driving vehicle ...");
	}
}

class Bike extends Vehicle {

	void wearHelmet() {
		System.out.println(" wear helmet...");
	}

	void startByUsingKicker() {
		System.out.println(" Bike started using Kicker...");
	}
}