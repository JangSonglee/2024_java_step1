package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������ ������ ������� ?");
		
		String str;
		
		
		str=scan.nextLine();
		
		switch (str) {
		case "������":
			System.out.println("�佺Ʈ");
			break;
		case "ȭ����":
			System.out.println("������");
			break;
		case "������":
			System.out.println("��ȭ�丮");
			break;
		case "�����":
			System.out.println("���ö�");
			break;
		default:
			System.out.println("�ٽ� �Է��� �ּ���");
		}

	}

}
