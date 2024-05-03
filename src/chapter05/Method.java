package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버 변수(=필드)
	
	//생성자
	
	//메서드

	Scanner scan = new Scanner(System.in);
	
	//private은 건너가서 참조를 못하게끔! 같은 클래서에서는 사용 가능 : 선언을 꼭 해줘야 함 !
	public void makeBread() {
		System.out.println("빵을 만듭니다");
	}//메서드 1
	
	//public은 생략이 가능!
	void makeBread(int count) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
	}//메서드 2
	
	void makeBread(int count, String name) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 "+count+"개의 "+name+"빵이 모두 완료되었습니다.");
	}//메서드 3
	//========================메서드 안에 메서드가 들어 올 수 있따 !
	void order() {
		
		boolean run=true;
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int input_num = scan.nextInt();
			/*
			switch (input_num) {
			case 1:
				System.out.println("빵 개수 입력 : ");
				int cnt1=scan.nextInt();
				makeBread(cnt1);
				break;
			case 2:
				System.out.println("빵 개수 입력 : ");
				int cnt2=scan.nextInt();
				System.out.println("종류 선택 : ");
				String name=scan.nextLine();
				makeBread(cnt2, name);
				break;
			case 3:
				System.out.println("프로그램 종료");
				run=false;
				break;
				
			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}//swich
			*/
			
			//next(): 공백허용안함 hello world 중 hello만 인식 = String
			//nextLine() : 공백허용 hello world 중 hello world 전부 인식 = String
			
			if(input_num==1) {//쓰고 버리는 것이 if문, 계속 선언해 줘야함 <-> 계속 반복하는 것이 while문, 계속 선언 X
				System.out.print("주문할 빵의 갯수:");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2){
				System.out.print("주문할 빵의 갯수:");
				int cnt=scan.nextInt();
				System.out.print("주문할 빵의 종류:");
				String name=scan.next(); 
				makeBread(cnt, name);
			}else if(input_num==3) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 번호 입니다.");
			}
			
		}//while
	}
	
	
}
