package chapter02;

public class LogicRest01 {

	public static void main(String[] args) {
		// �� ������
		char a,b;
		boolean c;
		a='A'; //65
		b='B'; //66
		
		c=(true|| true) && false; //T && f
		System.out.println(c); //F
		//&&�� �� �� �ϳ��� �����̿��� ���� !
		
		c=a<b && (a==b); //T && F
		System.out.println(c); // F
		
		System.out.println("============");
		
		c=a<b||(a==b); // T || F
		System.out.println(c); // T
		//||�� �� �� �ϳ��� �����̸� ���� !

	}

}
