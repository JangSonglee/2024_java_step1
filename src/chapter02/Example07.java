package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 한 자릿수 숫자를 입력받아 (scan)
		// 숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)
		Scanner scan=new Scanner(System.in);
		System.out.print("한 자릿수 숫자를 입력 : ");
		int number=scan.nextInt();
		
		String result=(number % 2 == 0)?"짝수":"홀수";
		System.out.println("입력하신 숫자는 "+result+" 입니다");
		
//		int num=scan.nextInt();
//		int tot=num%2;
//		String result=(tot==0)?"짝수":"홀수";
//		System.out.print("입력하신 숫자는 "+result+" 입니다.");
		

	}

}
