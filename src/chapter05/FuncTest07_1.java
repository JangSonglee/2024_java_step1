package chapter05;

import java.util.Scanner;

public class FuncTest07_1 {
	
	
	public static String EduStep(int edu) {
		String step="";
		
		//���1
		if(edu==1) {
			step = "1Step";
		}else if(edu==2) {
			step = "2Step";
		}else if(edu==3) {
			step = "3Step";
		}else {
			step = "�������� �ʴ� �ܰ�";
		}
		
		//���2
//		switch (_edu) {
//		case 1:
//			step = "Step1";
//			break;
//
//		case 2:
//			step = "Step2";
//			break;
//
//		case 3:
//			step = "Step3";
//			break;
//
//		default:
//			step = "�������� �ʴ� �ܰ�";
//			break;
//		}
		
		return step;//String
		
		
	}

	public static void main(String[] args) {
		//����ڷκ��� ���͵� �ܰ踦 �Է� �޾Ƽ� EduStep ȣ���ϱ�
		//�޼ҵ带 ȣ���� ������� ��ȯ�޾� step�� ����

		Scanner scan=new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		int number=scan.nextInt();
		
		String step=EduStep(number);//�ǸŰ�����
		
		System.out.println("���� ���� �ܰ�� "+step+" �Դϴ�.");
		
		

	}

}
