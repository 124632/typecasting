class Sample {
	public static void main(String[] args) {
		System.out.println(" main method ended");

		byte i=25;
		int j=i;
		short k=i;

		System.out.println("i="+i+"\nj="+j+"\nk="+k);

		long ph=9898989898989l;
		int x=(int) ph;
		System.out.println("ph="+ph+"\nx="+x);

		int a=500;
		byte b=(byte) a;
		System.out.println("a="+a+"\nb="+b);

		char ch = 'a';
		int p=ch;
		byte q=(byte)ch;
		System.out.println("$->"+p);
		System.out.println(q);

		boolean val=true;
		//ch=(char) val;      //boolean never be converted to numberic DT
		System.out.println(ch);

		System.out.println(" main method ended....");
	}
}