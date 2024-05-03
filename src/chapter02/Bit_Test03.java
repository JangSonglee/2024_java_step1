package chapter02;

import java.util.Scanner;

public class Bit_Test03 {

	public static void main(String[] args) {
		// 키보드 입력값 받기
		//int scanner;//숫자만 들어갈 수 있는 방
		Scanner scanner= new Scanner(System.in);
		//클래스 타입이기 때문에 안에 소스들 중 사용하고 싶은 것을 쓰면 된다
		//Scanner 방 안에 있는 메서드들 중에서 쓰고 싶은 내용이 있으면 new Scanner(System.in) 선언을 하고 공간을 만들어 줘야 사용이 가능하다!
		//.찍었을 때 나오는 것은 클래스 안나오면 일반 자료
		//string str;
		System.out.print("첫 번째 숫자 입력 : ");//ln삭제 : 줄넘김 취소(?)
		int num1=scanner.nextInt();
		
		System.out.print("두 번째 숫자 입력 : ");
		int num2=scanner.nextInt();
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResult=num1 & num2;
		int orResult=num1 | num2;
		int xorResult=num1 ^ num2;
		
		System.out.println("비트 AND 결과 : "+andResult);
		System.out.println("비트 OR 결과 : "+orResult);
		System.out.println("비트 XOR 결과 : "+xorResult);
		
		
	}

}
