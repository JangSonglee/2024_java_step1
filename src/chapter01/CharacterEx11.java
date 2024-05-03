package chapter01;

public class CharacterEx11 {

	public static void main(String[] args) {
		// A~Z:65~90 / a~z:97~122
		int a=72;
		System.out.println(a);
		System.out.println(a+10);
		
		System.out.println("--------------");
		//명시적 형변환 int > char
		System.out.println((char)a); //아스키코드 : a는 65인데 a를 문자로 변경하라고 명시하여 변환!
		System.out.println("==============");
		
		int b=90;
		System.out.println(b);
		System.out.println((char)b);
		System.out.println("==============");
		
		int a2=122;
		System.out.println(a2);
		System.out.println((char)a2);
	}

}
