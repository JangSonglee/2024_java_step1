package chapter02;

public class AssignTest03 {

	public static void main(String[] args) {
		// 음수표시 & 음수로 변환
		
		int num1=10;
		int num2=20;
		
		System.out.println(+num1);
		System.out.println(-num2);//음수로 특수문자 표시만
		System.out.println(num2);
		
		num2=-num2;
		System.out.println(num2);//대입연산 특수문자가 아닌 -로 바뀌어서 표시

	}

}
