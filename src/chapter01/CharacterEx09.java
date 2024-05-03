package chapter01;

public class CharacterEx09 {

	public static void main(String[] args) {
		// Java 에서 Char : 2바이트(16비트) => 유니코드 / 다국어 처리 가능
		// C,C++,C# 에서 Char : 1바이트(8비트) 다국어 처리 불가능(대부분 기계를 위한 언어)
		
		//char는 일반 자료 String은 일반 자료가 아니고 최상위 클래스
		
		char str1='A'; //문자, 작은 따옴표
		
		String str2="Hello Java"; //문자열, 큰 따옴표
		String str3="W";
		String str4="Welcome to Java";
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		System.out.println("str4 : "+str4);
	}

}
