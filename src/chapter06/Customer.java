package chapter06;

public class Customer {

	//멤버변수
	public String customerName;
	public int money;
	
	//생성자
	public Customer(String customerName, int money) {
		
		this.customerName = customerName;
		this.money = money;
	}
	
	//메소드
	public void visitCafe(Cafe cafe, int amount) { //음료 구매 후 수입 증가
		cafe.sell(amount);
		this.money -= amount;
	}
	
	//잔액
	public void showInfo() {
		System.out.println(customerName + "님의 잔액은 : "+money+"원 입니다.");
	}
	
}
