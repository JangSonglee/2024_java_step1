package chapter03.fortest;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 1�������� 100������ �� �߿��� 3�� ����� ã�� ���� ����ϼ���
		
		int num;
		int total=0;
		
		for(num=1;num<=100;num++) {
			if(num%3==0) {
				total+=num;
			}
		}
		System.out.print("����� �� : "+total);
		
		

	}

}
