class Sample {
	int i = 20;

	void test() {
		int i = 30;
		System.out.println(i); //30
		System.out.println(this.i); //20

	}
}

class Demo extends Sample {
	int i = 40;

	void dummy() {
		System.out.println(i); 
		System.out.println(super.i); 
	}
}

class Tester {
	public static void main(String[] args) {
		new Demo() . dummy();
		new Demo() . test(); //30 and 20(parent class values)
	}
}
