package chapter01;

public class ImplicitConversion13 {

	public static void main(String[] args) {
		//묵시적 형변환 : 작은 메모리에서 큰 메모리로 자연스럽게 형변환(byte > int)
		byte bNum=10;
		int  iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int  iNum2=10;
		//byte bNum2=iNum2; //ERROR
		
		
		System.out.println(iNum2);
		
		//묵시적 형변환 : 더 정밀한 수로 자연스럽게 암시적 형변환(int > float)
		int aNum=10;
		float fNum=aNum;
		
		System.out.println(aNum);
		System.out.println(fNum);
		
		float fNum2=30.5f;
		// int aNum2=fNum2; //ERROR
		
		System.out.println(fNum2);
		
		

	}

}
