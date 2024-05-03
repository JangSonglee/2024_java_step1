package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		String select="";
		int money=0;
		
		Vending ven = new Vending();
		ven.init(); //음료 준비 완료
		
		System.out.println("돈을 투입하세요");
		Scanner scan = new Scanner(System.in);
		money=scan.nextInt();
		ven.showCans(money);
		System.out.println("--------------");

		System.out.println("음료를 선택하세요 : ");
		select=scan.next();//nextLine : space & enter은 끝나는 것으로 인식
		ven.outCan(select);
	}

}
