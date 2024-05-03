package chapter02;

public class Example04 {

	public static void main(String[] args) {
		//원의 넓이를 구하세요.(반지름*반지름*3.14)
		//반지름 :10, 3.14는 double로 정의하여 구하시오
		//반지름 변수방 num1 / 3.14 변수방 pi / 넓이 변수방 result
				
		//#1		
		int num1=10;
		double pi=3.14;
		
		
		//int -> double 묵시적 형변환
		double result=num1*num1*pi;
		System.out.println(("원의 넓이 : ")+result);
		
		//#2
		int num2=10;
		int num3=3;
		int num4=14;
		
		//String => Double.parseDouble
		//int => Integer.parseInt		
		
		double result2=num2*num2*Double.parseDouble(num3+"."+num4);
		System.out.println("원의 넓이 : "+result2);
		
		//스트링으로 바꾸고 싶은 데이터가 있으면 스트링은 일반 자료가 아니기 때문에 Double.parseDouble 을 불러와야 한다
		//int를 사용했는데 스트링을 불러오고 싶다 ? Integer.parseInt도 사용!

	}

}
