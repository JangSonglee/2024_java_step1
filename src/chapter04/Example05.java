package chapter04;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		//�л����� �Է¹޾�, ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ� ������Ʈ
		boolean run=true;
		
		int studentNum=0;
		int[] score=null;
		int jumsu;
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo=Integer.parseInt(scan.nextLine());
			
			if(selectNo==1) {
				System.out.print("�л� �� > ");
				studentNum=Integer.parseInt(scan.nextLine());
				score=new int[studentNum]; //÷�ڸ� �̿��Ͽ� ���� Ȯ��
			}else if(selectNo==2) {
				for(int i=0;i<studentNum;i++) {
					System.out.print("score["+(score[i]+1)+"] :");
					score[i]=Integer.parseInt(scan.nextLine()); // score�迭�濡 ��� �Է�
				}//for
			}else if(selectNo==3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("score["+i+"] :"+score[i]);
					
				}//for
			}else if(selectNo==4) {
				int max =0;
				int sum =0;
				double avg=0.0;
				//������ ���1
//				for(int i=0;i<score.length;i++) {
//				max= max < score[i] ? score[i] : max; //�ְ����� 
//				sum += score[i]; //����
//				}
//				
//				avg=sum/(double)studentNum;
//				System.out.println("�ְ� ���� : "+max);
//				System.out.println("���� : "+sum);
//				System.out.println(String.format("��� : %.2f",avg)); %.2f//c��� folat 2��° �� ����
				
				for(int i = 0; i < score.length; i++) {
					if(max < score[i]) {
						max = score[i];
					}
					sum += score[i];
				}//for
				avg = (double)sum / score.length;
				
				System.out.println("�ְ� ���� : "+max);
				System.out.println("���� : "+sum);
				System.out.println("��� : "+avg);
				
			}else if(selectNo==5) {
				run=false;
			}
		
		}//while
		System.out.println("���α׷� ����");

		
	}

}
