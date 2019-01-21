package application;

public class StringReplaceApp {

	public static void main(String[] args) {
		
		String str = "abracadabra";
		
		System.out.println(str.replace('a', 'o'));
		System.out.println(str.replace("ra", "ro"));
		System.out.println(str.replaceAll("ab", "ba"));
		
		System.out.println(removeAllSpaces("sdaff       sdfsdf      sdfsf        sdf"));
	}
	
	public static String removeAllSpaces(String orig) {
		if(orig==null)return orig;
//		String str = orig.replace(" ","");
//		return str;
		return orig.replace(" ", "");
	}

}
