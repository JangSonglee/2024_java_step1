package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*���� ���߱� ����
		 * 1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ����
		 * ���� �Է��� ���ڰ� ��ǻ�Ͱ� ������
		 */
		
		Scanner scan=new Scanner(System.in);
		
		Random random=new Random();
		
		int targetNumber=random.nextInt(100)+1;
		int guess;
		int count=0;
		
		System.out.println("1���� 100���� ���ڸ� ���纸����!");
		
		do {
			//����ڰ� ������ ���� �Է� �޾Ƽ� ī��Ʈ �ϳ��� ����
			guess=scan.nextInt();
			count++;
			
			//���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ�� "�� ���� ���ڸ� �����ϼ���| ���
			//���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���| ���
			if(targetNumber>guess) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
			}else if(targetNumber<guess){
				System.out.println("�� ���� ���ڸ� �����ϼ���");
			}
			
		}while(guess != targetNumber);
		System.out.println("�����մϴ�! " + count + "�� ���� ���߾����ϴ�.");
		System.out.println("PC�� ������ ���� : "+targetNumber);
		System.out.println("User�� ������ ���� : "+guess);
	}

}
