package chapter05;

public class Example01 {

	/*�� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 �����غ�����.*/
	public static int sum1(int a, int b) {
		int hap=a+b;
		return hap;
	}
	
	public static void sum2(int a, int b) {
		System.out.println("���2 ) �� ���� ���� : "+(a+b));
		
	}
	
	
	public static void main(String[] args) {
		
		//Example01 ex1=new Example01();
			
		int num1=10;
		int num2=20;
		//int result=ex1.sum(num1, num2); < �ص� �Ǳ� ������ ���� �׷� �ʿ䰡 ����~
		int result=sum1(num1,num2);
		
		System.out.println("���1 ) �� ���� ���� : "+result);
		
		//���2
		sum2(num1,num2);

	}

}
