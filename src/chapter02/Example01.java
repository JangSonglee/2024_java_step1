package chapter02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 534개의 책을 학생 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기
		
//		int books=534;
//		int students=30;
//		
//		//학생당 한 명이 가지는 책의 수
//		int bookN =books / students;
//		System.out.println("한 명이 가지는 책의 수 : "+bookN); //17
//		
//		//남은 책의 수
//		int bookL =books % students;
//		System.out.println("남은 책의 수 : "+bookL); //24
		
		
		//Scanner 응용
		Scanner scanner= new Scanner(System.in);
		System.out.print("책의 갯수 입력 : ");//ln삭제 : 줄넘김 취소(?)
		int num1=scanner.nextInt();
		
		System.out.print("인원 수 입력 : ");
		int num2=scanner.nextInt();
		
		int aResult=num1 / num2;
		int bResult=num1 % num2;
		
		System.out.println("한 명이 가지는 책의 수 : "+aResult);
		System.out.println("남은 책의 수 : "+bResult);
		
	}

}
