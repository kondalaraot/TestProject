package com.practise;

public class TestJavaProj {
	
	static char[] name ={'K','O','N','D','A','L','R'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name);
		reverse(name);
		System.out.println(name);

	}
	
	private static void reverse(char[] charArray) {
		for(int i = 0; i < charArray.length / 2; i++)
		{
		    char temp = charArray[i];
		    charArray[i] = charArray[charArray.length - i - 1];
		    charArray[charArray.length - i - 1] = temp;
		}
	}

}
