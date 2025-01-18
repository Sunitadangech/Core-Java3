package com.Program;

public class Method {
	public static void main(String[] args) {
		System.out.println("main(String[])");
		main();
		main("Hello");
		main(10);
		main(23.45);
	}
	
	public static int main() {
		System.out.println("main()");;
		return 0;
	}
	private static void main(String arg) {
		System.out.println("main(String)");
		
	}
	
	protected static void main(int arg) {
		System.out.println("main(int)");
		
	}
	
	private static void main(double arg) {
		System.out.println("main(double)");
		
	}

}
