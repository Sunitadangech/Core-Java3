package com.Program;

public class HeapMemory {
	public static void main(String[] args) {
		
	
          String str1="Hello";
          String str2="Hello";
          String str3= new String("Hello");
          String str4= new String("Hello");
          
          String str5=str1.concat("World");
          System.out.println(str1);//Hello
          System.out.println(str5);//Hello World
          

          String str6 = str3.concat(" world");
          System.out.println(str3);//Hello
          System.out.println(str6);//Hello World
          
          String str7=str2.concat("world");
          
          System.out.println(str1==str2);//true
          System.out.println(str3==str4);//false
          System.out.println(str5==str6);//false
          System.out.println(str5==str7);//true
        
          
          
	}     
          
          
}
