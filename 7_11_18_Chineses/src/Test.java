
public class Test {

	private static final int NUM_CHINESE = 100000;

	public static void main(String[] args) {
		
		Chinese[] china = new Chinese[NUM_CHINESE];
		
		for(int i = 0; i < china.length; i++) china[i] = new Chinese("Lee");
		System.out.println(china[0]);
		System.out.println(china[50000]);
		System.out.println("==============");
		
		china[50000].setName("Mao");
		
		System.out.println(china[50000]);
		System.out.println(china[0]);
	}

}
