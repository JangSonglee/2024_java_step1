package chapter05;

public class CarMain {

	public static void main(String[] args) {

		Car mycar = new Car(); //heap
		mycar.carName="��� K5";
		mycar.carColor="�Ͼ��";
		
		System.out.println("������� ��� : "+mycar.carName);
		System.out.println("�޼��� ��� : "+mycar.getCarName());

		//��������� �̿��� �÷����
		System.out.println("������� ��� : "+mycar.carColor);
		//�޼��带 �̿��� ���� �̸��� �÷� ���
		System.out.print("�޼��� ��� : ");
		mycar.showCarInfo();
		
	}

}
