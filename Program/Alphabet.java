package com.Program;
//WAJP to check whether a given characters is alphabet.If the character is alphabet then check whether the alphabet is lower case or upper case.
//If the alphabet is upper case then convert the lower and vice varsa and print that alphabet after convertion.
public class Alphabet {
	public static void main(String[] args) {
//	char ch='a';
//	if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
//		if(ch >= 'A' && ch <= 'Z') {
//			char res = (char) (ch + 32);
//			System.out.println(res);
//		}
//		else {
//			char res =(char)(ch-32);
//			System.out.println(res);
//		}
//	}
//	else {
//		System.out.println("The Character ia not Alphabet");
//	}
//	
//		
		
		
		
		char ch='A';
		if(Character.isAlphabetic(ch)) {
			if(Character.isUpperCase(ch)) {
				System.out.println(Character.toLowerCase(ch));
			}
			else {
				System.out.println(Character.toUpperCase(ch));
			}
		}
		else {
			System.out.println("The Character ia not Alphabet");
		}
	}

}