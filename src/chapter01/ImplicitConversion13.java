package chapter01;

public class ImplicitConversion13 {

	public static void main(String[] args) {
		//������ ����ȯ : ���� �޸𸮿��� ū �޸𸮷� �ڿ������� ����ȯ(byte > int)
		byte bNum=10;
		int  iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int  iNum2=10;
		//byte bNum2=iNum2; //ERROR
		
		
		System.out.println(iNum2);
		
		//������ ����ȯ : �� ������ ���� �ڿ������� �Ͻ��� ����ȯ(int > float)
		int aNum=10;
		float fNum=aNum;
		
		System.out.println(aNum);
		System.out.println(fNum);
		
		float fNum2=30.5f;
		// int aNum2=fNum2; //ERROR
		
		System.out.println(fNum2);
		
		

	}

}
