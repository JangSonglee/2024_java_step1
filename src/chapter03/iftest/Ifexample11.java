package chapter03.iftest;

import java.util.Scanner;

public class Ifexample11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID=scan.nextLine();
		
		
		
		if(ID.equals("admin")) {
			System.out.print("비밀번호 : ");
			int pass=Integer.parseInt(scan.nextLine());
			if(pass==240219) {
				System.out.println(ID+"님 환영합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("일치하는 아이디가 없습니다.");
		}

	}

}
