package chapter03.iftest;

public class Ifexample06 {

	public static void main(String[] args) {
		// 1�� ~ 6������ ���� �� ���� �� ������ �н� ���
		int num=(int)(Math.random()*6)+1;//6���� ����

		if(num==1) {
		System.out.println("1�� > ����");
		}else if(num==2) {
		System.out.println("2�� > ��¡��Ƣ��");
		}else if(num==3) {
		System.out.println("3�� > ������");
		}else if(num==4) {
		System.out.println("4�� > �踻��");
		}else if(num==5) {
		System.out.println("5�� > �");
		}else {
		System.out.println("6�� > ���");
		}

	}

}
