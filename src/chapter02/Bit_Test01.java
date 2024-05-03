package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {

		int num1=5; //0101
		int num2=10; //1010
		
		//Bit OR(|) : 하나라도 1이면 1로 결과값 변환
		//|가 하나면 비트연산 ||두 개면 논리연산
		int result=num1 | num2;
		System.out.println(result);
		
		//Bit AND(&) : 모두 1이면 1로 결과값 변환
		result=num1 & num2;
		System.out.println(result);
		
		//Bit XOR(^) : 0과 1이면 1로 결과값 반환
		result=num1 ^ num2;
		System.out.println(result);

	}

}
