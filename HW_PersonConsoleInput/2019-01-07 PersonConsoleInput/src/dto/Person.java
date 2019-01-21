package dto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import MyException.PersonDataException;

public class Person {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Random gen = new Random();
	
	private String firstName;
	private String secondName;
	private int year;
	private double weight;
	private boolean married;
	
	public Person() {}

	public Person(String firstName, String secondName, int year, double weight, boolean married) throws PersonDataException {
		super();
		try {
			setFirstName(firstName);
		} catch (PersonDataException e) {
			System.out.println(e.getMessage());
			this.firstName = "empty string";
		}
		try {
			setSecondName(secondName);
		} catch (PersonDataException e) {
			System.out.println(e.getMessage());
			this.secondName = "empty string";
		}
		try {
			setYear(year);
		} catch (PersonDataException e) {
			System.out.println(e.getMessage());
			this.year = -1000;
		}
		try {
			setWeight(weight);
		} catch (PersonDataException e) {
			System.out.println(e.getMessage());
			this.weight = -1000;
		}
		try {
			setMarried(married);
		} catch (PersonDataException e) {
			System.out.println(e.getMessage());
			this.married = false;
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstNameInTheConsole() throws IOException, PersonDataException 
	{
		while(true) 
		{
			boolean exitFlag = false;
			String line = null;
			while(true) 
			{
				System.out.print("input firstName - ");
				line = br.readLine();
				try {
					setFirstName(line);
					exitFlag = true;
					break;
				} catch (PersonDataException e) {
					System.out.println("try one more time"); 
				}
			}
			if(exitFlag)break;	
		}		
	}
	
	public void setFirstName(String firstName)throws PersonDataException {
		if(firstName == null)throw new PersonDataException("first name is null");
		if(firstName.length() < 4 )throw new PersonDataException("the name is too short");
		if(!isNameSymbol(firstName))throw new PersonDataException("firstName is wrong");
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondNameInTheConsole() throws IOException, PersonDataException {
		
		while(true)
		{
			String lineSecondName = null;
			boolean exitFlag = false;
			while(true)
			{
				System.out.print("input secondName - ");
				lineSecondName = br.readLine();
				try {
					setSecondName(lineSecondName);
					exitFlag = true;
					break;
				} catch (PersonDataException e) {
					System.out.println("try one more time");
				}
			}
			if(exitFlag)break;
		}
	}
	
	public void setSecondName(String secondName)throws PersonDataException {
		if(secondName == null)throw new PersonDataException("second name is null");
		if(secondName.length() == 0) throw new PersonDataException("second name is too short");
		if(!isNameSymbol(secondName))throw new PersonDataException("secondName is wrong");
		this.secondName = secondName;
	}

	public int getYear(){
		return year;
	}
	
	public void setYearInTheConsole() throws IOException, PersonDataException {
		while(true) 
		{
			int year = 0;
			String yearStr = "";
			boolean exitFlag = false;
			while(true)
			{
				System.out.print("input year from 1920 to 2019 - ");
				try {
					
					yearStr = br.readLine();
					yearStr.trim();
					year = Integer.parseInt(yearStr);
					setYear(year);
					exitFlag = true;
					break;
				} catch (PersonDataException | NumberFormatException|IOException e ) {
					System.out.println("try one more time");
				}
			}
		if(exitFlag)break;			
		}	
	}

	public void setYear(int year) throws PersonDataException{
		if(year < 1920)throw new PersonDataException("the year isn't right");
		if(year > 2019)throw new PersonDataException("the year is wrong");
		this.year = year;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeightInTheConsole() throws IOException, PersonDataException {
		while(true) 
		{
		String weightStr = "";
		double weight = 0;
		boolean exitFlag = false;	
			while(true) 
			{
				try {
					System.out.print("input weight from 50 to 300 - ");
					weightStr = br.readLine();
					weightStr.trim();
					weight = Double.parseDouble(weightStr);
					setWeight(weight);
					exitFlag = true;
					break;					
				} catch (PersonDataException | NumberFormatException| IOException e) {
					System.out.println("try one more time");
				}
			}
			if(exitFlag)break;
		}
	}
	
	public void setWeight(double weight) throws PersonDataException{
		if(weight < 50 || weight > 300)throw new PersonDataException("wrong input data");
		this.weight = weight;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarriedInTheConsole() throws IOException, PersonDataException {
		while(true) 
		{
			String married = "";
			boolean exitFlag = false;
			while(true)
			{
				try {
					System.out.print("are you married : input true or false - ");
					married = br.readLine();
					if(married.equalsIgnoreCase("true")) {
						this.married = true;
						exitFlag = true;
						break;
					}
					else if(married.equalsIgnoreCase("false")) {
						this.married = false;
						exitFlag = true;
						break;
					}	
				} catch (Exception e) {
					System.out.println("try one more time");
				}
			}
			if(exitFlag)break;
		}
	}
	
	public void setMarried(boolean married) throws PersonDataException{
		if(year < 18 || !married)throw new PersonDataException("");
		this.married = married;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (married ? 1231 : 1237);
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (married != other.married)
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firstName = " + firstName + "; secondName = " + secondName + "; year = " + year + "; weight = " + String.format("%.1f ;",weight)
				+ (married ? "married":"single") + "]";
	}
	
	public void setPersonInTheConsole() throws IOException, PersonDataException {		
		setFirstNameInTheConsole();
		setSecondNameInTheConsole();
		setYearInTheConsole();
		setWeightInTheConsole();
		setMarriedInTheConsole();
	}
	
	public static Person getRandomPerson() throws PersonDataException {
		
		String names = "qwertyuiopasdfghjklzxcvbnm";
		String resFirstName = "";
		String resSecondName = "";
		for(int i = 0; i < 5; i++) resFirstName = resFirstName + names.charAt(gen.nextInt(names.length()));
		for(int i = 0; i < 9; i++) resSecondName = resSecondName + names.charAt(gen.nextInt(names.length()));
		
		String randomFirstName = resFirstName;
		String randomSecondName = resSecondName;
		int randomYear = gen.nextInt(80) + 1920;
		double randomWeight = gen.nextDouble()*100 + 20;
		boolean randomMarried = (randomYear > 18) ? gen.nextBoolean() : false;
		
		return new Person(randomFirstName, randomSecondName, randomYear, randomWeight, randomMarried);		
	}
	
	private static boolean isNameSymbol(String str) 
	{
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) 
		{
			if(!((str.codePointAt(i)>=65 && str.codePointAt(i)<=90)||(str.codePointAt(i)>= 97 && str.codePointAt(i)<= 122 ))) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	private static boolean isInteger(String str)
	{
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			if(!(str.codePointAt(i)>= 48 && str.codePointAt(i)<= 57)){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	private static boolean isDouble(String str)
	{
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			if(!(str.codePointAt(i)>= 48 && str.codePointAt(i)<= 57)||str.codePointAt(i)==46){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
