package chapter05;

import java.util.Scanner;

public class FuncTest07 {
	
	public static void EduStep(int edu) {
		
		if(edu==1) {
			System.out.println("���� ���͵� �ܰ�� step1 �Դϴ�.");
		}else if(edu==2) {
			System.out.println("���� ���͵� �ܰ�� step2 �Դϴ�.");
		}else if(edu==3) {
			System.out.println("���� ���͵� �ܰ�� step3 �Դϴ�.");
		}else {
			System.out.println("�ش��ϴ� ���͵� �ܰ谡 �����ϴ�.");
		}
		
	}

	public static void main(String[] args) {
		//����ڷκ��� ���͵� �ܰ踦 �Է� �޾Ƽ� EduStep ȣ���ϱ�
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		int number=scan.nextInt();
		EduStep(number);//�ǸŰ�����

	}

}