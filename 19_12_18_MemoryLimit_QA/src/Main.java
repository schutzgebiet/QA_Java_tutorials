
public class Main {

	public static void main(String[] args) { //Оценка оперативной памяти!!!!
		int[] arr;
		int left = 1;
		int right = Integer.MAX_VALUE;
		
		try {
			arr = new int[right];
			System.out.println(right);
			return;
		} catch (Error e) {
			arr = null;
			
			int middle = 0;
			while(right - left>1) {
				middle = left + (right - left)/2;
				
				System.out.println(left+";"+middle+";"+right);
				
				try {
					arr = new int[middle];
					left = middle;
				} catch (Error e1) {
					right = middle;
				}
				arr = null;
			}
			System.out.println(left);
		}

	}

}
