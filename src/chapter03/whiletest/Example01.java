package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* 사용자가 "no"를 입력하기 전까지*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메시지를 입력하세요.");
		System.out.println("종료하려면 no를 입력하세요.");
		
		String inputString;
		
		do {
			//입력받기
			inputString=scan.nextLine();
			//출력
			System.out.println(inputString+"(을)를 입력하셨습니다.");
		}while(!inputString.equals("no")); //equals 기억하기
		
		System.out.println();
		System.out.println("프로그램 종료");

	}

}
