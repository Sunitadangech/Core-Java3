package com.Program;
//WAJP to convert all the vowels present inside the given String to upper case String: input:-"hello world" output:-"hEllO wOrld"
public class Vowels1 {
	public static void main(String[] args) {
		String str="hello world";
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u'){
				ch = (char)(ch-32);
				temp=temp+ch;
			}
			else {
				temp=temp+ch;
			}
		}
		str=temp;
		System.out.println(str);//hEllo wOrld
	}

}
