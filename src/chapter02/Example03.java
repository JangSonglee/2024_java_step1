package chapter02;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//#1
				//���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
				//�׷��� ������ ���հ����� ��ȯ �Ͻÿ�.
		
		//����
		Scanner scanner= new Scanner(System.in);
		System.out.print("���� ���� �Է�1 : ");
		int mySc=scanner.nextInt();
		
		String sc2;
		sc2=(mySc>=60)?"�հ�":"���հ�";
		System.out.println("�հ� ���� : "+sc2);
		
		
		//����
		int score1=60;
		String pass=(score1>=60)?"�հ�":"���հ�";
		System.out.println("�հ� ����(����) : "+pass);
		
		
		
		//#2
				//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
				//score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		
		//����
		System.out.print("���� ���� �Է�2 : ");
		int mySc2=scanner.nextInt();
		
		char sc3;
		sc3=(mySc2 > 90)?'A':((mySc2 > 80)?'B':'C');
		System.out.println("���� : "+sc3);
		
		//����
		int score2=80;
		char grade;
		grade=(score2 > 90)?'A':((score2>80)?'B':'C');
		System.out.println("����(����) : "+grade);
		
		
	}

}
