package chapter02;

import java.util.Scanner;

public class Bit_Test03 {

	public static void main(String[] args) {
		// Ű���� �Է°� �ޱ�
		//int scanner;//���ڸ� �� �� �ִ� ��
		Scanner scanner= new Scanner(System.in);
		//Ŭ���� Ÿ���̱� ������ �ȿ� �ҽ��� �� ����ϰ� ���� ���� ���� �ȴ�
		//Scanner �� �ȿ� �ִ� �޼���� �߿��� ���� ���� ������ ������ new Scanner(System.in) ������ �ϰ� ������ ����� ��� ����� �����ϴ�!
		//.����� �� ������ ���� Ŭ���� �ȳ����� �Ϲ� �ڷ�
		//string str;
		System.out.print("ù ��° ���� �Է� : ");//ln���� : �ٳѱ� ���(?)
		int num1=scanner.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		int num2=scanner.nextInt();
		
		//System.out.println(num1);
		//System.out.println(num2);
		
		int andResult=num1 & num2;
		int orResult=num1 | num2;
		int xorResult=num1 ^ num2;
		
		System.out.println("��Ʈ AND ��� : "+andResult);
		System.out.println("��Ʈ OR ��� : "+orResult);
		System.out.println("��Ʈ XOR ��� : "+xorResult);
		
		
	}

}
