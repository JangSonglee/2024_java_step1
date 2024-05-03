package chapter07;

class Person2{
	
	String name;
	int age;
	
	//������
	public Person2() {
		this("�̸�����", 0);//this : Person2(String name, int age)�� ����
	}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	Person2 returnSelf() {
		// �ڱ� �ڽ��� �ּ�
		return this;

	}
	
}//class

public class CallAnotherConst {

	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName�� �ּ� : "+noName);
		System.out.println("noName�� �ּ� : "+noName.returnSelf());
		
		System.out.println("====================================");
		Person2 p = new Person2();
		System.out.println("p�� �ּ� : "+p);
		System.out.println("p�� �ּ� : "+p.returnSelf());
		//�ּ� ����
		System.out.println("====================================");
		Person2 person = noName.returnSelf();
		System.out.println("person�� �ּ� : "+person);
		System.out.println("person�� �ּ� : "+noName);
	}
	
}