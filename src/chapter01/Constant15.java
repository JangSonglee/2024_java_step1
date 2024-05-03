package chapter01;

public class Constant15 {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 값
		
		final int MAX_NUM=100;//초기화
		final int MIX_NUM; //선언
		final double PI=3.14;
		
		MIX_NUM=0; //리터널값
		//PI=3.141592; //선언을 하지 않고 초기화를 시켰기 때문에 엑박
		
		System.out.println(MAX_NUM);
		System.out.println(MIX_NUM);
		System.out.println(PI);

	}

}
