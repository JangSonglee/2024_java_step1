package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		x++; // 10 > 11
		++x; // 12
		System.out.println("x= : "+x);

		System.out.println("==============");
		//y 후위연산 후 전위연상
		
		y--; // 10 > 9
		--y; // 8
		System.out.println("y= : "+y);
		
		System.out.println("==============");
		//x후위연산 z에 대입
		x++;
		z=x;
		
		//System.out.println("x후위연산 : "+x); // 13
		System.out.println("x후위연산 z에 대입 : "+z);
		
		System.out.println("==============");
		//x전위연산 z에 대입
		z=++x;
		//System.out.println("x전위연산 : "+x); //14
		System.out.println("x전위연산 z에 대입 : "+z);
		
		System.out.println("==============");
		//x전위연산 + y후위연산의 결과값을 z에 대입
		++x;
		y++;
		z=(x+y);
		System.out.println("x전위연산 + y후위연산의 결과값을 z에 대입 : "+z);
		

	}

}
