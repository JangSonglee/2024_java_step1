package chapter04;

public class Example03 {

	public static void main(String[] args) {
		// �迭���� �ִ밪�� ã�Ƽ� ���
		
		int max=0;
		int array[]= {1,6,9,2,35,178,234,4,5,11};
		
		//for������ if������ ������ ũ�⸦ ��
		//max���� 0�� �迭���� ������ ����
		
		//���1
//		for(int i=0;i<array.length;i++) {
//			if(max<array[i]) {
//				max=array[i];
//			}
//		}//for
//		System.out.println("�ִ� �� : "+max);
		
		//���2 : Ȯ��
		for(int i : array) {
			if(max<i) {
				max=i;
			}
		}//for
		System.out.println("�ִ� �� : "+max);
		
	}

}
