package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* ����ڰ� "no"�� �Է��ϱ� ������*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("�����Ϸ��� no�� �Է��ϼ���.");
		
		String inputString;
		
		do {
			//�Է¹ޱ�
			inputString=scan.nextLine();
			//���
			System.out.println(inputString+"(��)�� �Է��ϼ̽��ϴ�.");
		}while(!inputString.equals("no")); //equals ����ϱ�
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
