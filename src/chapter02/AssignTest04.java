package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 전위연산 : ++,-- 먼저 적용 후 대입
		System.out.println("===전위연산===");
		int gameScore=150;
		
		//int lastScore1=gameScore+1; 1이라는 숫자만 생략 가능 2부터는 안돼!
		int lastScore1=++gameScore; //++는 1씩 증가
		System.out.println(gameScore); //gameScore > 151
		System.out.println(lastScore1); //gameScore > 151
		System.out.println("============");
		int lastScore2=--gameScore; //int lastScore1=gameScore-1
		System.out.println(gameScore); //gameScore > 150
		System.out.println(lastScore2); //gameScore > 150
		
		//후위연산 : 먼저 대입한 후 ++,-- 추가
		//int lastScore1=gameScore+1; 1이라는 숫자만 생략 가능 2부터는 안돼!
		System.out.println("===후위연산===");
		int lastScore3=gameScore++;
		System.out.println(lastScore3); //gameScore > 151
		System.out.println(gameScore); //gameScore > 150
		
		System.out.println("============");
		int lastScore4=gameScore--;
		System.out.println(lastScore4); //gameScore > 150
		System.out.println(gameScore); //gameScore > 151
		
		

	}

}
