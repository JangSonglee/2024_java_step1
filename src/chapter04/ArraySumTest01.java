package chapter04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum=0;
		double avg;
		
		/*
		 * for
		 * score���� ��� > score[0]: 98
		 * sum �����濡 ���� ����
		*/
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]: "+score[i]);//���� ���
			sum+=score[i]; 
			
		} 
		//sum ����
		System.out.println("���� : "+sum); //���� ����
		
		//avg ��� ���� �� ���(��, avg�� �Ǽ�)
		
		avg=(double)sum/score.length;
		System.out.println("��� : "+avg);
		//�ݿø�
		System.out.print("�ݿø� : "+Math.round(avg));
	}

}
