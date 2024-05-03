package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num, num2;
		int save = 0;
		int money;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			num=scan.nextInt();
			
			if(num==1) {
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 금액 : "+save);
				System.out.print("입금할 금액을 입력하세요 : ");
				money=scan.nextInt();
				if(money<=0) {
					//0보다 작거나 같으면 경고 메세지 출력 그렇지 않으면 save에 저장(if)
					System.out.println("잘 못 입력하셨습니다.");
				}else {
					save+=money;
				}
			}else if(num==2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 금액 : "+save);
				System.out.print("출금할 금액을 입력하세요 : ");
				money=scan.nextInt();
				//save에서 출금
				//출금 시도 후 잔액이 부족하면 다시 입금(if)
				if(save<=money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					save-=money;
					System.out.println("출금 후 남은 금액 : "+save);
				}
			}else if(num==3) {
				System.out.println("잔액확인을 선택하셨습니다.");
				System.out.println("현재 금액 : "+save);
			}else if(num==4) {
				System.out.println();
				run=false;
			}else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다.");
			}
		}//while
		System.out.println("프로그램 종료");
	}

}
