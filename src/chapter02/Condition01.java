package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		// 삼항 연산

		int a=10;
		int b=15;
		boolean result; //boolean은 진실 혹은 거짓만 올 수 있음
		result=a>=b?true:false;
		System.out.println(result);
		
		System.out.println("---------------");
		
		int n1=10;
		int n2=20;
		char result2;
		result2=(++n1 == n2)?'Y' : 'N'; //char이니까 문자 사용 가능
		System.out.println(result2);
	}

}
