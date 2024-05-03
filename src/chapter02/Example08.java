package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요. (true/false)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력 : ");
		int num1=sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력 : ");
		int num2=sc.nextInt();
		
		/*String result;
		result=(num1>num2)?"처음 입력한 숫자보다 큽니다":"처음 입력한 숫자보다 작습니다" ;*/
		
		String result = (num1>num2) ? "첫번째 숫자가 더 크다":(num1==num2)? "같습니다" : "두번째 숫자가 더 크다";
		
		
		 
		
		System.out.println("결과 : "+result);
		
		
		

	}

}
