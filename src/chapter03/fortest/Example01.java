package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// �� ���� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
		// ������ ����� ���Ͻÿ�. (��, ����� �Ǽ��� ����� ��)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0, score;
		double avg=0;
		
		System.out.println("�� ���� ������ �˰� �����Ű���?");
		cnt=scan.nextInt();
		
		for(i=1;i<=cnt;i++) {
			//���� �Է� �ޱ�
			System.out.print(i+"�� �л��� ������ �Է��ϼ���");
			score = scan.nextInt();
            sum+=score;
		}
		
		avg=(double)sum/cnt; //double
		
		System.out.print(cnt + "���� ���� ����" + sum+"���̰� ");
		System.out.print("����� : " + avg+"�Դϴ�");

	}

}
