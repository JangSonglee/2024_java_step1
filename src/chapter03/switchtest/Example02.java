package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("오늘은 무엇을 먹을까요 ?");
		
		String str;
		
		
		str=scan.nextLine();
		
		switch (str) {
		case "월요일":
			System.out.println("토스트");
			break;
		case "화요일":
			System.out.println("떡볶이");
			break;
		case "수요일":
			System.out.println("중화요리");
			break;
		case "목요일":
			System.out.println("도시락");
			break;
		default:
			System.out.println("다시 입력해 주세요");
		}

	}

}
