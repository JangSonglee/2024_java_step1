package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num=scan.nextInt();
			 
			if(num==0) {
				break;
			}//if
			
			cnt++; //���ڰ� � �Է� �Ǿ�����
			sum+=num; //������
		}//while
		avg=(double)sum/cnt;
		
		System.out.print("�Էµ� �ڷ��� ���� : "+cnt+"\n");
		System.out.print("�Էµ� �ڷ��� ���� : "+sum+"\n");
		System.out.print("�Էµ� �ڷ��� ���� : "+Math.round(avg*1000.0)/1000.0);
	}

}
