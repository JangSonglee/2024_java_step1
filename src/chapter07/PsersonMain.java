package chapter07;

public class PsersonMain {

	public static void main(String[] args) {
		Person personKim=new Person("김유신");
		System.out.println(personKim.name="김유신");
		System.out.println(personKim.height=180f);
		System.out.println(personKim.weight=80F);
		
		System.out.println("-----------------------------");
		Person personKang=new Person("강감찬");
		System.out.println(personKang.name="강감찬");
		System.out.println(personKang.height=175f);
		System.out.println(personKang.weight=75F);
		
		System.out.println("-----------------------------");
		Person personLee=new Person("이순신");
		System.out.println(personLee.name="이순신");
		System.out.println(personLee.height);
		System.out.println(personLee.weight);

	}

}
