package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //����(+), ���(-)
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------");
			System.out.print("���� > ");
			
			int menuNum=Integer.parseInt(scan.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.print("���ݾ� > ");
				balance+=Integer.parseInt(scan.nextLine());
				break;
				
			case 2:
				System.out.print("��ݾ� > ");
				balance-=Integer.parseInt(scan.nextLine());
				break;
			case 3:
				System.out.print("�ܰ� > ");
				System.out.println(balance);
				
				break;
			case 4:
				System.out.println("����");
				run=false;
				
				break;
				
			default:
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �� �� �Է����ּ���.");;
			}//switch
			System.out.println();
		}//while
		System.out.println("���α׷� ����");
	}

}
