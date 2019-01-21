package randomLib;


import java.util.Random;

@SuppressWarnings("serial")
public class RandomExt extends Random{
	
	private static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static int alphabetLength = alphabet.length();
	
	public int nextIntRange (int min, int max) throws RandomLibraryException {
		
		int difference = max-min+1;
		if (difference <= 0L) throw new RandomLibraryException("nextIntRange; max-min+1 = " + difference);
		return min + nextInt(difference);
	}
	
	public long nextLongLimited (long upperLimit) throws RandomLibraryException{
		
		if (upperLimit < 1L) throw new RandomLibraryException("nextLongLimited; upperLimit = " + upperLimit);
		long nextLong = nextLong();
		return (nextLong >= 0 ? nextLong : - nextLong)%upperLimit;
	}
	
	public long nextLongRange(long min, long max) throws RandomLibraryException {
	
		long difference = max-min+1; 
		if (difference <= 0L) throw new RandomLibraryException("nextLongRange; max-min+1 = " + difference);
		return min + nextLongLimited(difference);
	}
	
	public double nextDoubleRange(double min, double max){
		return min + nextDouble()*(max-min);
	}
	
	public boolean nextBoolean(double trueProbability){
		return nextDouble() < trueProbability;
	}
	
	public String nextString(int len){
		if (len <= 0) return "";
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<len; i++)sb.append(alphabet.charAt(nextInt(alphabetLength)));
		return sb.toString();
	}
	
	public String nextString(String[] stringArray) {
		return stringArray[nextInt(stringArray.length)];
	}
	
	public <T> T nextElement(T[] array) {
		return array[nextInt(array.length)];
	}
	
	public <T> void shuffle(T[] array){
		for (int end = array.length-1; end > 0; end--) swap(array, nextInt(end+1), end);
	}
	
	private <T> void swap(T[] array, int i, int j) {
		T pocket = array[i];
		array[i] = array[j];
		array[j] = pocket;
	}
	

}
