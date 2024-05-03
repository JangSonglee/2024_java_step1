package chapter05;

import java.util.Scanner;

public class FuncTest07_1 {
	
	
	public static String EduStep(int edu) {
		String step="";
		
		//방법1
		if(edu==1) {
			step = "1Step";
		}else if(edu==2) {
			step = "2Step";
		}else if(edu==3) {
			step = "3Step";
		}else {
			step = "존재하지 않는 단계";
		}
		
		//방법2
//		switch (_edu) {
//		case 1:
//			step = "Step1";
//			break;
//
//		case 2:
//			step = "Step2";
//			break;
//
//		case 3:
//			step = "Step3";
//			break;
//
//		default:
//			step = "존재하지 않는 단계";
//			break;
//		}
		
		return step;//String
		
		
	}

	public static void main(String[] args) {
		//사용자로부터 스터디 단계를 입력 받아서 EduStep 호출하기
		//메소드를 호출한 결과값을 반환받아 step에 저장

		Scanner scan=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int number=scan.nextInt();
		
		String step=EduStep(number);//실매개변수
		
		System.out.println("현재 수업 단계는 "+step+" 입니다.");
		
		

	}

}
