
public class Test {

	public static void main(String[] args) {
		
		String str1 = "mnbvcxz";
		String str2 = "mNBvcxZ";
		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str3 = "BabyBoy";
		String str4 = "BabyBoy\t\n ";
		
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println(str3.equals(str4.trim()));
		
		String pattern1 = "http://mySite/admin";
		String address = "http://mySite/admin?log=sasha&psw=12345";
		
//		System.out.println(address.startsWith(pattern1));
//		System.out.println(address.endsWith(pattern1));
		
		String[] fileNames = {"contracthtml.doc","page.html","mynotes.txt","invite.html","superpuper.exe"};
		
//		for(int i =0 ; i < fileNames.length; i++) {
//			if(fileNames[i].endsWith(".html")) System.out.println(fileNames[i]);
//		}
		
		String str5 = "SENYAZAEBALSUKAPETUH";
		String str6 = "ZAEBAL";
		String str7 = "PE";
	
		//System.out.println(str5.indexOf(str6));
		System.out.println(str5.indexOf(str7, 4));
		
		System.out.println(str5.lastIndexOf(str7,1));
		
		String str8 = "pghghtSENHGHKkh";
		
		System.out.println(str5.substring(0, 2).equals(str8.substring(6, 8)));
	}

}
