package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {

		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : "+(++a));//(a=a+1 = a+=1) => 11
		System.out.println("a++ : "+(a++));//a=a > (a=a+1 = a+=1) => 11
		System.out.println("후위연산 : "+a);//a++에서 1이 추가되어 12
		System.out.println("=======================");
		System.out.println("c++ : "+(c++));//3
		System.out.println("후위연산 : "+c);//c++에서 1이 추가되어 4

		System.out.println("=======================");
		//a 전위연산 + b 후위연산
		
		//#1
		System.out.println("++a + b++"+(++a + b++)); //13+20(b++이기 때문에 ;을 빠져나와 +1이 된다)=33
		System.out.println("후위연산 : "+b); //21
		System.out.println("=======================");
		//#2
		System.out.println("++a : "+(++a)); //14
		System.out.println("b++ : "+(b++)); //21
		System.out.println("후위연산 : "+b); //22
		System.out.println("++a + b++ : "+(++a + b++)); //15+22=37
		System.out.println("후위연산"+b); //23
		
	}

}
