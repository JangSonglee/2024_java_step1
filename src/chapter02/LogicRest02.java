package chapter02;

public class LogicRest02 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((i=i+2)<10 && (num1=num1+2)<10);
		System.out.println(i); //4
		System.out.println(num1);
		System.out.println(value);//false
		
		System.out.println("================");
		//boolean�� �� �� �θ��� ���� ��
		value=((i=i+2)<10 || (num1=num1+2)<10);
		System.out.println(i); //6
		System.out.println(num1); //14�� ������ 12�̴� : �� �κ��� true�̹Ƿ� ������ true, �׷��Ƿ� ������ �������� ����
		System.out.println(value); //true
		

	}

}
