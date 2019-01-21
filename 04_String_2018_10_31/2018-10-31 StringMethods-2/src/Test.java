
public class Test {

	public static void main(String[] args) {
		
		String str1 = "mnbvcxz";
		String str2 = "mNBvcxZ";
		
		//System.out.println(str1.equals(str2));
		//System.out.println(str1.equalsIgnoreCase(str2));
		
		String str3 = "sa sha";
		String str4 = "  \t  sa sha\t\n   ";
		
		//System.out.println(str3);
		//System.out.println(str4);
		//System.out.println(str3.equals(str4.trim()));
		
		String pattern1 = "http://mySite/admin";
		String address1 = "http://mySite/admin?log=sasha&psw=12345";
		
		//System.out.println(address1.startsWith(pattern1));
		
		String[] fileNames = {"contracthtml.doc", "page.html", "mynotes.txt", "invite.html", "superpuper.exe"};
/*		for (int i=0; i<fileNames.length; i++) {
			if(fileNames[i].endsWith(".html"))System.out.println(fileNames[i]);
		}
*/
		String str5 = "abracadabra";
		String str6 = "cadaba";
		String str7 = "ra";
		//System.out.println(str5.indexOf(str6));
		System.out.println(str5.indexOf(str7));
		System.out.println(str5.indexOf(str7, 4));
		System.out.println(str5.lastIndexOf(str7, 4));
	}

}
