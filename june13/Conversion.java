package june13;

public class Conversion {
	static String abcd;
	public Conversion(String abcd) {
		this.abcd=abcd;
	}
	public int test() {
		return Integer.parseInt(abcd);
	}

	public static void main(String[] args) {
		try {
		Conversion i =new Conversion("16");
		System.out.println(i.test());
		}
		catch(NumberFormatException e){
			System.out.print("Cannot convert "+abcd+" to int");
		}
		

	}

}
