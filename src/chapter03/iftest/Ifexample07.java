package chapter03.iftest;

import java.util.Scanner;

public class Ifexample07 {

	public static void main(String[] args) {
		// Scanner ���
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. ù ��° �� : ");
		double num1=Double.parseDouble(scan.nextLine());//String�� �ֻ����̱� ������ ������ ����� ��ȯ
		System.out.println("ù ��° �Է¹��� �� ���"+num1);
		System.out.println();
		
		//num2
		System.out.print("2. �� ��° �� : ");
		double num2=Double.parseDouble(scan.nextLine());//String�� �ֻ����̱� ������ ������ ����� ��ȯ
		System.out.println("�� ��° �Է¹��� �� ��� : "+num2);
		System.out.println();

	}

}
