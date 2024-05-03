package chapter01;

public class IntegerVariable04 {

	public static void main(String[] args) {

		short sVal=20;
		byte bVal=40;
		int cVal=80;
		long result= sVal + bVal + cVal;
		
		//각각의 변수방 출력
		System.out.println("short 타입 :" + sVal);
		System.out.println("byte 타입 :" + bVal);
		System.out.println("int 타입 :" + cVal);
		System.out.println("long 타입 :" + result);
		System.out.println("long 타입2 :" + (sVal + bVal + cVal));
		
		

	}

}
