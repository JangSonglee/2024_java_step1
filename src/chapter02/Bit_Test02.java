package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {

		int num=0B0000101; //5
		System.out.println(num);
		
		System.out.println(num << 2);//5*4=20
		System.out.println(num >> 2);//5/4=1
		
		int a,b,c;
		a=5;
		b=2;
		c=a>>b;
		System.out.println(c);//5/4=1
		
		c=a<<b;
		System.out.println(c);//5*4=20

	}

}
