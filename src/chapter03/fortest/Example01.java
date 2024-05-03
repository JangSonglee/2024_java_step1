package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 몇 명의 성적을 입력 받을 것인지 정수로 인원수를 입력 받고,
		// 총점과 평균을 구하시오. (단, 평균은 실수로 출력할 것)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0, score;
		double avg=0;
		
		System.out.println("몇 명의 성적을 알고 싶으신가요?");
		cnt=scan.nextInt();
		
		for(i=1;i<=cnt;i++) {
			//성적 입력 받긱
			System.out.print(i+"번 학생의 성적을 입력하세요");
			score = scan.nextInt();
            sum+=score;
		}
		
		avg=(double)sum/cnt; //double
		
		System.out.print(cnt + "명의 점수 합은" + sum+"점이고 ");
		System.out.print("평균은 : " + avg+"입니다");

	}

}
