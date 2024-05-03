package chapter01;

public class BinaryTest02 {

	public static void main(String[] args) {
		// 카멜기법 : 첫 자는 무조건 소문자, 중간단어의 첫 자를 대문자로 선언
		// 파스칼기법 : 첫 자는 무조건 대문자 나머지 소문자
		
		int num=10;
		int bNum=0B1000; //Binary 즉 2진수(0,1)
		int oNum=010; //8진수(OCT)
		
		System.out.println("실진수 : "+num);
		System.out.println("이진수 : "+bNum);
		System.out.println("팔진수 : "+oNum);
		System.out.println("--------------------");
		
		int bNum2=0B10000;
		int hNum=0xF; //16진수(Hex) 0~9까지는 표현이 가능하지만 10부터 15까지는 알파벳(A~F)으로 표현함 
		
		System.out.println("이진수 :"+bNum2);
		System.out.println("16진수 :"+hNum);

	}

}
