package application;

public class SplitJoinApp {

	public static void main(String[] args) {
		
		String db = "Zhiguli;  1987;  1.3 ; false;"; // salitaut na oshibku $(dolar),  .(tocka),  ^(krishka)  (ih nujno ekranirovat  Z.B.: db.split("\\$");)
		String[] data = db.split(";");
		
		for(int i =0 ; i<data.length;i++)System.out.println(data[i]);
		
		int newYear = Integer.parseInt(data[1].trim())+5;
		System.out.println(newYear);
		
		System.out.println("=====================================");
		
		String db1 = "Zhiguli;  1987;  1.3 ; false;"; 
		String[] data1 = db1.split(";");
		
		for(int i =0 ; i<data1.length;i++)data1[i] = data1[i].trim();
		
		String newString = String.join("!", data1);
		System.out.println(newString);
	}

}
