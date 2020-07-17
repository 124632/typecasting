class Sample {
	void display() {
		System.out.println(" Good Moring");
	}
}
class Demo extends Sample {
	void display() {
		System.out.println(" Good Noon");
	}
}
class Test extends Demo {
	void display() {
		System.out.println(" Good Evening");
	}

	void disp() {
		System.out.println(" HI");
	}
}

class SampleTester {
	public static void main(String[] args) {

		Sample s1 = new Sample();
		s1.display(); //GM

		Sample s3 = new  Test();
		s3.display(); //GE
		//s3.disp(); //Error
	}
}