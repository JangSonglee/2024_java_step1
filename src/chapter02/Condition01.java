package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		// ���� ����

		int a=10;
		int b=15;
		boolean result; //boolean�� ���� Ȥ�� ������ �� �� ����
		result=a>=b?true:false;
		System.out.println(result);
		
		System.out.println("---------------");
		
		int n1=10;
		int n2=20;
		char result2;
		result2=(++n1 == n2)?'Y' : 'N'; //char�̴ϱ� ���� ��� ����
		System.out.println(result2);
	}

}
