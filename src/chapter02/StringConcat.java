package chapter02;

public class StringConcat {

	public static void main(String[] args) {
		//String �����濡�� +�� ��������ڰ� �ƴ� ��ȣ������(���� �����ϴ� ������)�� ���
		//��, �ݵ�� ���ڿ��� ���� ����Ǿ�� �Ѵ�
		
		//��Ʈ���� "����"+�ٸ� �͵��̶� ������ �����ϴ�! ������ ���⵵ ����
		String str1="JDK"+14;
		String str2=str1+" ���";
		
		System.out.println(str2);
		
		
		//� ���� ���� ���� �Ǵ��Ŀ� ���� �ٸ� ��� ���� ��Ÿ����
		String str3="JDK"+11+13;
		String str4=11+13+"JDK";
		
		System.out.println(str3);
		System.out.println(str4);

	}

}
