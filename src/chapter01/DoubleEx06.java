package chapter01;

public class DoubleEx06 {

	public static void main(String[] args) {
		// Number : bit(8=1byte) > byte(1byte) > short(2byte) > int(4byte) > long(8byte)
		// 실수(소수) : float(4byte) > double(8byte)
		// 문자 : char(' ') 
		// 문자열 : String(" ")
		
		float fnum=3.14f; // 4byte
		double dnum=3.14; // 8byte 
		//더블 기준으로 작은 수가 들어오면 float으로 자동변환 되기 때문에 굳이 float을 쓸 이유가 없음 !

		System.out.println(fnum);
		System.out.println(dnum);
	}

}
