package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for ���� �̿��Ͽ� ���� �迭�� ������ �� ������ ����� ���ϼ���
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}}; //3�� x��

		/* �� ���� 2���� �迭
		 * 95 86 > 0��
		 * 83 92 96 > 1��
		 * 78 83 93 87 88 >2��
		 */
		
		double avg=0;
		int total=0;
		int alltotal=0;
		int count=0;
		//�� array.length > 3
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {//0�� > 0��, 1��
			total += array[i][j]; //array[0][0] array[0][1]
			count++;//��ü ����� ���� �� ���� ī��Ʈ
			}
			
			alltotal += total; //��ü ��տ� ���� ��
			avg=(double)total/array[i].length;
			System.out.println((i+1)+"��° ���� ��� �� : "+avg+"�Դϴ�.");
			total=0;//���� ���� ����� ���� �����Ⱚ ���� �ȱ׷��� ���� ��� ���� �ǰŵ� !		
		}//for
		avg=(double)alltotal/count;
		System.out.println("�迭 ��ü�� ��� �� : "+avg);
	}

}
