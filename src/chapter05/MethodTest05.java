package chapter05;

public class MethodTest05 {

	public static void main(String[] args) {

		System.out.println(add(5,3)); //+
		System.out.println(subtract(10,4)); //-
		System.out.println(multiply(6,7)); //*
		System.out.println(divide(20.4,4.0)); ///

	}
	
	public static int add(int a, int b) {
		int result1 = a+b;
		return result1;
	}
	
	public static int subtract(int a, int b) {
		int result2 = a-b;
		return result2;
	}
	
	public static int multiply(int a, int b) {
		int result3 = a*b;
		return result3;
	}
	
	public static double divide(double a, double b) {
		double result4 = a/b;
		return result4;
	}

}
