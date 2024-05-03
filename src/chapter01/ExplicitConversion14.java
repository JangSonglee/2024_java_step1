package chapter01;

public class ExplicitConversion14 {

	public static void main(String[] args) {
		// 캐스팅 문법(명시적 형변환)
		int iNum=1000;
		byte bNum=(byte)iNum; //-128 ~ 127 (2의n승에서 2의n-1승까지)

		System.out.println(iNum);
		System.out.println(bNum); //엉뚱한 수가 나옴 > 유실된 결과 값 (손실)
		System.out.println("====================");
		
		double dNum1=1.2;
		float fNum1=0.9f;
		
		int iNum2=(int)(dNum1+fNum1); //1.2+0.9=2.1 > 2
		int iNum3=(int)dNum1+(int)fNum1; //1+0=1
		
		System.out.println(iNum2);
		System.out.println(iNum3);
	}

}
