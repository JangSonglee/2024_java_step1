package chapter06;

public class StudentinfoMain {

	public static void main(String[] args) {
		
		//객체 : 공간을 만들어 놓고 멤버변수나 public을 참조하는 것
		// #1. 멤버변수 직접 초기화 : studentKim
		Studentinfo studentKim = new Studentinfo();
		System.out.println(studentKim.address);
		
		//초기화 : 위의 방법으로 불러오면 하나하나 다 초기화해서 프린트해줘야 한다 !
		studentKim.studentID = 100;
		studentKim.grade = 3;
		studentKim.address = "부천";
		System.out.println(studentKim.address);
		
		//객체의 다양성(?)
		//#2. 생성자를 통한 초기화 : studentLee
		Studentinfo studentLee = new Studentinfo(1004, "꼬맹", 12, "부천");
		System.out.println(studentLee.address);
		
		//#3. getter & setter 초기화 : studentPark
		Studentinfo studentPark = new Studentinfo();
		System.out.println(studentPark.address);
		studentPark.setStudentName("송이");
		System.out.println(studentPark.getStudentName());
		

	}

}
