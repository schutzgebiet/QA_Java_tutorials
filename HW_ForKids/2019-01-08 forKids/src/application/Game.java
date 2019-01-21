package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
	public static	Random gen = new Random();
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		int num = getRandom();
		String	numStr = Integer.toString(num);
		while(true) 
		{
			boolean exitFlag = false;
			String line = null;
			while(true) 
			{
				line = br.readLine();
				line.trim();
				//System.out.println(line);
				if(line.equals(numStr)) 
				{
					System.out.println("It's right");
					exitFlag = true;
					break;
				}
				else System.out.print("\ntry one more time\t");
			}
			if(exitFlag)break;
		}
	}

	public static int getRandom() {
		
		int firstNum ;
			firstNum = gen.nextInt(50)+1;
		
		int secondNum = gen.nextInt(50)+1;
		int num = gen.nextInt(4);
		int sum = 0;
		switch(num) {
		case 0 : {	System.out.print("how much will be: "+firstNum+"+"+secondNum +" = ");
					sum = firstNum + secondNum; 
					break;}
		case 1 : {	System.out.print("how much will be: "+firstNum+"-"+secondNum +" = ");
					sum = firstNum - secondNum;
					break;}
		case 2 : {	System.out.print("how much will be: "+firstNum+"*"+secondNum +" = ");
					sum = firstNum * secondNum;
					break;}
		case 3 : {	System.out.print("how much will be: "+firstNum+"/"+secondNum +" = ");
					sum = firstNum / secondNum; 
					break;}
		}
		return sum;	
	}
	
}
