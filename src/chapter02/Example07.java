package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// �� �ڸ��� ���ڸ� �Է¹޾� (scan)
		// ���ڰ� ¦������ Ȧ������ ����ϴ� ���α׷�(���� ������ ���)
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �ڸ��� ���ڸ� �Է� : ");
		int number=scan.nextInt();
		
		String result=(number % 2 == 0)?"¦��":"Ȧ��";
		System.out.println("�Է��Ͻ� ���ڴ� "+result+" �Դϴ�");
		
//		int num=scan.nextInt();
//		int tot=num%2;
//		String result=(tot==0)?"¦��":"Ȧ��";
//		System.out.print("�Է��Ͻ� ���ڴ� "+result+" �Դϴ�.");
		

	}

}
