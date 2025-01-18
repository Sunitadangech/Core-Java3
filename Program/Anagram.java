package com.Program;
import java.util.Arrays;
//WAJP to check whether a given two string are anagram of each other.print true if the given string are anagram of each other otherwise print false.
public class Anagram {
	public static void main(String[] args) {
		String str1 = "silet";
		String str2 = "lisen";
		boolean isAnagram=false;
		if(str1.length() == str2.length()){
			char [] arr1 =str1.toCharArray();
			char [] arr2 =str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			isAnagram = Arrays.equals(arr1 , arr2);
		}
		System.out.println(isAnagram);
	}

}















