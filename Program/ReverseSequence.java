package com.Program;
//WAJP to reverse the squence of words separated by commas in a given String.
public class ReverseSequence {
	public static void main(String[] args) {
		String str = "Ramesh, Suresh, Mahesh, Umesh, Ganesh";
		String temp = "";
		String [] arr = str.split(",");
		for(int i=arr.length-1;i>=0;i--) {
			if(i > 0) {
				temp = temp + arr[i] +",";
			}
			else {
				temp=temp+arr[i];
			}
		}
		str=temp;
		System.out.println(str);
	}

}



//
//
//
//		String str="Apple,Ball,Cat,Dog,Elephant,Flower";
//		System.out.println(str);
//		String temp="";
//		String[] arr=str.split(",");
//		for(int i=arr.length-1;i>=0;i--) {
//			if(i!=0) {
//			temp += arr[i] + ",";
//			}
//			else {
//				temp += arr[i];
//			}
//		}
//		str=temp;
//		System.out.println(str);
//	}
//	
//}
//
//
//
////public class ReverseWords {
////	public static void main(String[] args) {
////		String str="Apple,Ball,Cat,Dog,Elephant,Flower";
////		String[] arr=str.split(",");
////		for(int i=arr.length-1;i>=0;i--) {
////			System.out.println(arr[i]);
////			}
////	}
////	
////}
