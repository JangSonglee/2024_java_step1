package chapter02;

public class Example04 {

	public static void main(String[] args) {
		//���� ���̸� ���ϼ���.(������*������*3.14)
		//������ :10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi / ���� ������ result
				
		//#1		
		int num1=10;
		double pi=3.14;
		
		
		//int -> double ������ ����ȯ
		double result=num1*num1*pi;
		System.out.println(("���� ���� : ")+result);
		
		//#2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//String => Double.parseDouble
		//int => Integer.parseInt		
		
		double result2=num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println("���� ���� : "+result2);
		
		//��Ʈ������ �ٲٰ� ���� �����Ͱ� ������ ��Ʈ���� �Ϲ� �ڷᰡ �ƴϱ� ������ Double.parseDouble �� �ҷ��;� �Ѵ�
		//int�� ����ߴµ� ��Ʈ���� �ҷ����� �ʹ� ? Integer.parseInt�� ���!

	}

}
