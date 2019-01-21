
public class TestString {

	public static void main(String[] args) {
		
		
		//if(c>64 && c<91) c = (char)(c+32);
		//creating new varibel and setting A
		char upperA ='A';
		byte chNum =(byte) upperA;
		System.out.println(chNum);
		
		char upperZ = 'Z';
		byte chNumZ = (byte) upperZ;
		System.out.println(chNumZ);
		
		String strRes = StringHelper.ourToLowerCase("#&*Hallo Dear How Are You?");
		System.out.println(strRes);
		
		
	}

}
