package chapter03.iftest;

import java.util.Scanner;

public class Ifexample07 {

	public static void main(String[] args) {
		// Scanner 사용
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.print("1. 첫 번째 수 : ");
		double num1=Double.parseDouble(scan.nextLine());//String은 최상위이기 때문에 강제로 더블로 전환
		System.out.println("첫 번째 입력받은 수 출력"+num1);
		System.out.println();
		
		//num2
		System.out.print("2. 두 번째 수 : ");
		double num2=Double.parseDouble(scan.nextLine());//String은 최상위이기 때문에 강제로 더블로 전환
		System.out.println("두 번째 입력받은 수 출력 : "+num2);
		System.out.println();

	}

}
