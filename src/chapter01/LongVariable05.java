package chapter01;

public class LongVariable05 {

	public static void main(String[] args) {
		// Long Type
		//int num1=12345678900; //int => 32��Ʈ(X) ������ ��Ʈ
		long num2=12345678900L; //long => 64��Ʈ(X) ū ���ڴ� ��
		long num3=1000; //long���� 64��Ʈ���� L�� ����Ǿ� ���� �����Ƿ� int�� �ν��Ͽ� �ڵ� ����ȯ ��
		
		System.out.println(num2);
		System.out.println(num3);
		
		int level; //���� �ϰ� �ʱ�ȭ ���� ���� ����
		level=10; //���ͳ�(����) ��
		
		System.out.println(level);
		System.out.println(num2+num3); // �� ū ������ long���� �ڵ��� ��ȯ

	}

}