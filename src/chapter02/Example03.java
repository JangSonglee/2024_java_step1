package chapter02;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		//#1
				//삼항연산자를 이용하여 score1이 60 보다 크거나 같으면 합격
				//그렇지 않으면 불합격으로 반환 하시오.
		
		//응용
		Scanner scanner= new Scanner(System.in);
		System.out.print("나의 점수 입력1 : ");
		int mySc=scanner.nextInt();
		
		String sc2;
		sc2=(mySc>=60)?"합격":"불합격";
		System.out.println("합격 여부 : "+sc2);
		
		
		//정답
		int score1=60;
		String pass=(score1>=60)?"합격":"불합격";
		System.out.println("합격 여부(정답) : "+pass);
		
		
		
		//#2
				//삼항연산자를 이용하여 score2가 90보다 크면 'A'이고
				//score2가 80보다 크면 'B' 그 이하는 모두 'C'로 간주한다
		
		//응용
		System.out.print("나의 점수 입력2 : ");
		int mySc2=scanner.nextInt();
		
		char sc3;
		sc3=(mySc2 > 90)?'A':((mySc2 > 80)?'B':'C');
		System.out.println("학점 : "+sc3);
		
		//정답
		int score2=80;
		char grade;
		grade=(score2 > 90)?'A':((score2>80)?'B':'C');
		System.out.println("학점(정답) : "+grade);
		
		
	}

}
