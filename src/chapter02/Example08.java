package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���. (true/false)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է� : ");
		int num1=sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է� : ");
		int num2=sc.nextInt();
		
		/*String result;
		result=(num1>num2)?"ó�� �Է��� ���ں��� Ů�ϴ�":"ó�� �Է��� ���ں��� �۽��ϴ�" ;*/
		
		String result = (num1>num2) ? "ù��° ���ڰ� �� ũ��":(num1==num2)? "�����ϴ�" : "�ι�° ���ڰ� �� ũ��";
		
		
		 
		
		System.out.println("��� : "+result);
		
		
		

	}

}
