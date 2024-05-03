package chapter01;

public class BinaryVariable03 {

	public static void main(String[] args) {
		// bit가 8개가 모여야 1byte가 된다 !short은 2byte 이기니까 bit 16개
		// 0=>양수
		// 1=>음수
		int num1=0B00000000000000000000000000000101; //+5
		int num2=0B11111111111111111111111111111010; //1의보수 => -6 num1의 반대로
		int num3=0B11111111111111111111111111111011; //2의보수 => -5 num2의 마지막 글자만 1
		
		System.out.println("num1 : "+num1);
		System.out.println("num1의 1의 보수 : "+num2);
		System.out.println("num1의 2의 보수 : "+num3);
		System.out.println("num1+num3 : "+(num1+num3));

	}

}
