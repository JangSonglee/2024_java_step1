package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		// �� 2�� ���� (Kim 12000 / Park 10000)
		Customer ctKim = new Customer("��", 12000);
		Customer ctPark = new Customer("��", 10000);
		
		//ī�� ����(ī�� ��ü �̸� > ���̳��� Ŀ��)
		Cafe cfName = new Cafe("���̳��� Ŀ��");
		
		//ī�� �湮(���̳��� Ŀ�� > Kim 4000 / Park 4500)
		ctKim.visitCafe(cfName, 4000);
		ctPark.visitCafe(cfName, 4500);
		
		//ī�� ���� Ȯ��
		cfName.showInfo();
		
		//�� ���� Ȯ��
		ctKim.showInfo();
		ctPark.showInfo();

	}

}
