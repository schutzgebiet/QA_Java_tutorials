import java.util.Arrays;
import java.util.Random;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class RandomGeneratorTest {
	
	private static final int NUM_ITARATION = 10;
	private static RandomExt gen = new RandomExt();

	public static void main(String[] args) throws RandomLibraryException {
		
//		int positiveCounter = 0;
//		int negativeCounter = 0;
//		
//		for(int i=0; i<NUM_ITARATION; i++) {
//			if(gen.nextInt() > 0) positiveCounter++;
//			else negativeCounter++;
//		}
//		System.out.println(positiveCounter);
//		System.out.println(negativeCounter);
		
//		int[] results = new int[10];
//		int random = 0;
//		for(int i = 0 ; i<NUM_ITARATION; i++) {
//			random = gen.nextInt(100);
//			results[random/10]++;//results[i] = random;
//		}
//		System.out.println(Arrays.toString(results));
		
//		int min = 500;
//		int max = 550;
//		
//		for(int i = 0 ; i<NUM_ITARATION; i++)System.out.println(gen.nextIntRange(min, max));
		
//		double min = 50.33;
//		double max = 54.99;
//		
//		for(int i =0; i<NUM_ITARATION;i++)System.out.printf("%.2f",gen.nextDoubleRange(min, max));
		
//		for(int i =0; i<NUM_ITARATION;i++)System.out.println(gen.nextString(8));
		
		for(int i =0; i<NUM_ITARATION;i++)System.out.println(gen.nextBoolean(0.2));
		
	}
	
	public static int nextInt(int min, int max) {//generit sluchaynie chisla v intervale
		
		
		
		return min + gen.nextInt(max-min+1);
	}
}