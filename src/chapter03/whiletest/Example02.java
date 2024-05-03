package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		// 5! > 5x4x3x2x1 > n! > n*(n-1)*(n-2)*(n-3)*(n-4) 숫자가 0이 아닌 수까지만 반복
		
		int number=3;
		int factorial=1; //factoeial*=number
		
		//숫자가 0이 아닐 때까지 반복하는 팩토리얼 계산
		while(number > 0) {
			factorial *=number;
			number--;
		}
		System.out.println("팩토리얼 결과 : "+factorial);
	}

}
