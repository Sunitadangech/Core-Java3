package com.Program;
//WAJP to count the number of vowels,consonents,digits and special characters String="Hello World@1234";
public class Vowels {
	public static void main(String[] args) {
		String str="hello World @12345";
		str=str.toLowerCase();
		int v=0;
		int c=0;
		int d=0;
		int s=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch== 'u') {
					v++;
				}
				else {
					c++;
				}
			}
			else if(ch >= '0' && ch<='9') {
				d++;
			}
			else if(ch != ' ') {
				s++;
			}
		}
		System.out.println(v);
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
		
	}

}
