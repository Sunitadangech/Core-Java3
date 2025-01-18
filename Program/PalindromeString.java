package com.Program;
//WAJP to check whether a given string is palindrome string.if the string is palinf=drome then print true other wise print false.
//public class PalindromeString {
//	public static void main(String[] args) {
//		String str="NAYAN";
//		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
////			rev += str.charAt(i);
//			rev = rev+ str.charAt(i);
//		}
//		System.out.println(rev.equals(str));
//	}
//
//}



public class PalindromeString {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("nayan");
		StringBuffer temp = new StringBuffer(str);
		temp.reverse();
		System.out.println(temp.equals(str));
	}
}





