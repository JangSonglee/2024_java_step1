package chapter02;

public class Example05 {

	public static void main(String[] args) {
		/* 변수방에 51을 대입(변수방 : number)
		 * 그 수가 양수인지 여부를 판별하는 프로그램
		 * 변수방에 저장된 수가 양수면 "양수입니다"
		 * 그렇지 않을 경우 "음수 또는 0입니다."라고 출력이 되어야 함
		*/
		
		//변수 초기화
		int number=51;
		
		//관계연산자를 사용하여 양수 여부 판단
		boolean isPositive=(number > 0);
		
		//삼합 연산자 사용
		String result=isPositive?"양수입니다.":"음수 또는 0입니다.";
		System.out.println(result);

	}

}
