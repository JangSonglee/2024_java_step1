package chapter07;

public class Encapsulation {

	private int Side;
	private int Height;
	
	private void Ence() {
		Side = 0;
		Height = 0;
	}
	
	//Cal_Area
	public int Cal_Area(int a, int b) {
		Side=a;
		Height=b;
		
		return a*b;
	}
	
}
