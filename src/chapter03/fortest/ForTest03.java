package chapter03.fortest;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// �Է¹��� ���� �ʰ��ϸ� �ݺ����� ���ߴ� ����
		
		int i,sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num=scan.nextInt();
		
		for(i=1;;i++) {
			
			if(sum>num) {
				break;
			}
			
			sum+=i;
		}
		
		System.out.println((i-1)+"��°������ ���� : "+sum);
	}

}