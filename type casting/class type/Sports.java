class Sports {
	String type;
	long duration;
	int numofplayer;

	void toss() {
		System.out.println("toss process...");
	}

	void teamMeeting() {
		System.out.println(" Strategizing the game.....");
	}
}

class Cricket extends Sports {
	String groundName;

	void toss() {
		System.out.println("Team A chose to bat");
}
	void pitchReport() {
		System.out.println(" In favour batting");
	}
}

class Chess extends Sports {
	double boardsize;

	void toss() {
		System.out.println(" person A starts the game");
	}

	void announceWinner() {
		System.out.println("Winner announced..");
	}
}

class Tester {
	public static void main(String[] args) {
	System.out.println(" main method started...");

	Sports  s1 = new Cricket();
	s1.toss();
	s1.teamMeeting();
	System.out.println("- - - - - - - ");
	
	s1 = new Chess();
	s1.toss();
	s1.teamMeeting();
	System.out.println("- - - - - - - ");

	if(s1 instanceof Cricket) {
		System.out.println(" found cricket object");
		Cricket c1 = (Cricket) s1;
	} else
		System.out.println("found chess object");
		Chess c1 = (Chess) s1;
		c1.toss();
		c1.teamMeeting();
		c1.announceWinner();
	
		System.out.println(" main method ended...");
	}
}