package chapter01;

public class DoubleEx06 {

	public static void main(String[] args) {
		// Number : bit(8=1byte) > byte(1byte) > short(2byte) > int(4byte) > long(8byte)
		// �Ǽ�(�Ҽ�) : float(4byte) > double(8byte)
		// ���� : char(' ') 
		// ���ڿ� : String(" ")
		
		float fnum=3.14f; // 4byte
		double dnum=3.14; // 8byte 
		//���� �������� ���� ���� ������ float���� �ڵ���ȯ �Ǳ� ������ ���� float�� �� ������ ���� !

		System.out.println(fnum);
		System.out.println(dnum);
	}

}
