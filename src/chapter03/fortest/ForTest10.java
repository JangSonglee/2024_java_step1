package chapter03.fortest;

public class ForTest10 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"��"+"]"+"\t");
		}
		
		System.out.println();
		
		//i�� �ٽ� �����ϸ� �� �� �ִ� !
		//����for���� ���� for���� ������ ���� for���� ������ �� ����
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t"); //\t�� ��
			}
			System.out.println();
		}

	}

}
