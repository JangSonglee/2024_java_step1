package chapter06;

public class Vending {

	//멤버변수
	private Can[] can = new Can[5];
	private int money;
	
	//메소드
	public void init() {
		can[0]=new Can("환타", 1000);
		can[1]=new Can("콜라", 1500);
		can[2]=new Can("사이다", 1000);
		can[3]=new Can("포카리", 2000);
		can[4]=new Can("밀키스", 1500);
	}
	
	//사용 가능한 음료만 보여주기
	public void showCans(int m) {
		money=m;
		for(int i=0;i<can.length;i++) {
			if(can[i].getPrice()<=money) {
				System.out.println(can[i].getCanName()+"-"+can[i].getPrice()+"원");
			}
		}//for
	}//메소드
	
	//선택한 음료수 제공과 잔액 출력
	public void outCan(String name) {
		for(int i=0;i<can.length;i++) {
			if(name.equals(can[i].getCanName())) {
				System.out.println("선택하신 음료수는 "+can[i].getCanName()+"이고");
				System.out.println("잔액은 "+(money-can[i].getPrice())+"원 입니다");
				
			}//if
		}//for
	}//메소드
	
}
