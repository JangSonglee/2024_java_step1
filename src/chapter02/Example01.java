package chapter02;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 534���� å�� �л� 30���� �Ȱ��� ������ ������ ��,
		// �л��� ��� ������, ���������� � ������ ���غ���
		
//		int books=534;
//		int students=30;
//		
//		//�л��� �� ���� ������ å�� ��
//		int bookN =books / students;
//		System.out.println("�� ���� ������ å�� �� : "+bookN); //17
//		
//		//���� å�� ��
//		int bookL =books % students;
//		System.out.println("���� å�� �� : "+bookL); //24
		
		
		//Scanner ����
		Scanner scanner= new Scanner(System.in);
		System.out.print("å�� ���� �Է� : ");//ln���� : �ٳѱ� ���(?)
		int num1=scanner.nextInt();
		
		System.out.print("�ο� �� �Է� : ");
		int num2=scanner.nextInt();
		
		int aResult=num1 / num2;
		int bResult=num1 % num2;
		
		System.out.println("�� ���� ������ å�� �� : "+aResult);
		System.out.println("���� å�� �� : "+bResult);
		
	}

}
