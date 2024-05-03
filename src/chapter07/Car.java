package chapter07;

public class Car {

	//멤버변수
	String color;
	int cc;
	
	//생성자
	public Car(String color, int cc) {
		super();
		this.color = color;
		this.cc = cc;
	}
	
	//메소드
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
}
