package chapter06;

public class BuyCoffee {

	public static void main(String[] args) {
		// 고객 2명 생성 (Kim 12000 / Park 10000)
		Customer ctKim = new Customer("김", 12000);
		Customer ctPark = new Customer("박", 10000);
		
		//카페 생성(카페 객체 이름 > 힘이나는 커피)
		Cafe cfName = new Cafe("힘이나는 커피");
		
		//카페 방문(힘이나는 커피 > Kim 4000 / Park 4500)
		ctKim.visitCafe(cfName, 4000);
		ctPark.visitCafe(cfName, 4500);
		
		//카페 정보 확인
		cfName.showInfo();
		
		//고객 정보 확인
		ctKim.showInfo();
		ctPark.showInfo();

	}

}
