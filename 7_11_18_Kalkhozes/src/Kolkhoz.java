
public class Kolkhoz {
	
	private static int zakroma =0;
	
	public int getZakroma() {
		return zakroma;
	}

	
	public void harvest() {
		zakroma = zakroma + 1000000;
	}
}
