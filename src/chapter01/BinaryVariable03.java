package chapter01;

public class BinaryVariable03 {

	public static void main(String[] args) {
		// bit�� 8���� �𿩾� 1byte�� �ȴ� !short�� 2byte �̱�ϱ� bit 16��
		// 0=>���
		// 1=>����
		int num1=0B00000000000000000000000000000101; //+5
		int num2=0B11111111111111111111111111111010; //1�Ǻ��� => -6 num1�� �ݴ��
		int num3=0B11111111111111111111111111111011; //2�Ǻ��� => -5 num2�� ������ ���ڸ� 1
		
		System.out.println("num1 : "+num1);
		System.out.println("num1�� 1�� ���� : "+num2);
		System.out.println("num1�� 2�� ���� : "+num3);
		System.out.println("num1+num3 : "+(num1+num3));

	}

}
