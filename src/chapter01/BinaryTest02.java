package chapter01;

public class BinaryTest02 {

	public static void main(String[] args) {
		// ī���� : ù �ڴ� ������ �ҹ���, �߰��ܾ��� ù �ڸ� �빮�ڷ� ����
		// �Ľ�Į��� : ù �ڴ� ������ �빮�� ������ �ҹ���
		
		int num=10;
		int bNum=0B1000; //Binary �� 2����(0,1)
		int oNum=010; //8����(OCT)
		
		System.out.println("������ : "+num);
		System.out.println("������ : "+bNum);
		System.out.println("������ : "+oNum);
		System.out.println("--------------------");
		
		int bNum2=0B10000;
		int hNum=0xF; //16����(Hex) 0~9������ ǥ���� ���������� 10���� 15������ ���ĺ�(A~F)���� ǥ���� 
		
		System.out.println("������ :"+bNum2);
		System.out.println("16���� :"+hNum);

	}

}
