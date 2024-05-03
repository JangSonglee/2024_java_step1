package chapter02;

public class LogicRest01 {

	public static void main(String[] args) {
		// 논리 연산자
		char a,b;
		boolean c;
		a='A'; //65
		b='B'; //66
		
		c=(true|| true) && false; //T && f
		System.out.println(c); //F
		//&&는 둘 중 하나만 거짓이여도 거짓 !
		
		c=a<b && (a==b); //T && F
		System.out.println(c); // F
		
		System.out.println("============");
		
		c=a<b||(a==b); // T || F
		System.out.println(c); // T
		//||는 둘 중 하나만 진실이면 진실 !

	}

}
