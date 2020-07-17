class Tester {
	public static void main(String[] args) {
		System.out.pruntln(" main method started...");
	
		Vehicle v1 = new Vehicle();

		//Bike b = new Vehicle();   // can not convert parent object into child type

		System.out.pruntln("- - - - -");

		Vehicle v2 = new Bike(); //upcasting
		v2.name= "Yamaha RX100";
		v2.regNum="KA 03 EF 1234";
		v2.chasisNum=8989898989l;
		v2.start();
		v2.stop();
		//v2.wearHelmet(); //child specific method gives error
		System.out.pruntln("- - - - -");

		Bike bk = (Bike) v2;  // downcasting
		System.out.pruntln(" main method ended...");
	}
}