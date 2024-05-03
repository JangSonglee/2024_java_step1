package chapter06;

import java.util.Random;

public class Start {

	private int pcnum=new Random().nextInt(50)+1; //1~50 정수 추출
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//랜덤값보다 작으면 up, 크면 down, 일치하면 result="SUCCESS"
		if(pcnum>mynumber) {
			System.out.println("더 높은 숫자를 적어주세요");
		}else if(pcnum<mynumber) {
			System.out.println("더 낮은 숫자를 적어주세요");
		}else if(pcnum==mynumber){
			System.out.println(count+"회 만에 정답!");
			result="SUCCESS";
		}
		return result;
	}
	
	
}
