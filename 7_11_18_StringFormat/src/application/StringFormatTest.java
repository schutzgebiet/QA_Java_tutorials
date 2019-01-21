package application;

public class StringFormatTest {

	public static void main(String[] args) {
		
		double length = 1.;
		int num = 6;
		double oneLength = length/num;
		System.out.println("one = " + oneLength);
		System.out.println("one = " + String.format("%.3f", oneLength));

	}

}
