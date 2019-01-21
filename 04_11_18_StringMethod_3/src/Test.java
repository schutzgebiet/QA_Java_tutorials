
public class Test {

	public static void main(String[] args) {
		
		String tobe = "To be or not to be that is the question";
		
		int from = 3;
		int to = 15;
		
		System.out.println(tobe.substring(10));
		System.out.println(tobe.substring(from, to));
		
		System.out.println(toTitleCase("mather fUCker, gO in aSS"));
		
		System.out.println(getExtention("fucker.exe"));
		
		System.out.println("==========================================");
		String str ="buy Toyota!{name: Senya, age: 66}Trump president";
		System.out.println(removePadding(str));
		
		System.out.println(getHeadPadding(str));
		
		System.out.println(getTailPadding(str));
		
		System.out.println(getPassword());
	}
	
	public static String toTitleCase(String str) {
//		String firstLeter = str.substring(0, 1);
//		String firstLeterUpperCase = firstLeter.toUpperCase();
//		String tailOfText = str.substring(1);
//		return firstLeterUpperCase + tailOfText.toLowerCase();
		
		return str.substring(0, 1).toUpperCase()+
			str.substring(1).toLowerCase();	
	}
	
	/*public static String getExtention(String filename) {
		String c = ".";
		for(int i =0; i < filename.length(); i++) {
			if(c.contains(filename)) {
				return filename;
			}
		}
		return "error";
	}*/
	public static String getExtention(String filename) {
	    int dotIndex = filename.lastIndexOf('.');
	      if(dotIndex < 0 || dotIndex == filename.length() -1) return "";
	    return filename.substring(dotIndex+1);
	  }
	
	public static String removePadding(String s) {
	    int from = s.indexOf('{');
	    if(from < 0) 
	      return "{}";
	    int to = s.lastIndexOf('}');
	    if(to < 0 || to < from)
	      return "{}";
	    return s.substring(from, to+1);
	  }
	
	
	public static String removePaddings(String s) {
		int tmp = s.indexOf("{");
		int tmp2 =s.indexOf("}");
		if(tmp>0 && tmp2>0) {
			return s.substring(tmp+1, tmp2);
		}
		return s;
	}
	
	public static String getHeadPadding(String jsonp) {
		int to = jsonp.indexOf("{");
		if(to < 0) return jsonp;
		return jsonp.substring(0, to);
	}
	
	public static String getTailPadding(String jsonp) {
		int from = jsonp.lastIndexOf("}");
		if(from<0)return jsonp;
		return jsonp.substring(from+1);
	}
	
	public static String getPassword() {
		return Long.toUnsignedString(Long.parseLong(Double.toString(Math.random()).substring(2)),36);
		//Math.random() - random value from 0..1
		//Double.toString - convert double to String
		//Long.parseLong - convert string to long
		//Long.toUnsignedString - convert long value to unsigned and to String
	}

}
