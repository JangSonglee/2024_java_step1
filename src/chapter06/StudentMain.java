package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		
		//멤버변수 활용하여 초기화(이름, 주소)
		Student student1 = new Student();
		
		student1.studentName="장꼬맹";
		student1.address="부천";
		
		student1.showstudentInfo();
		
		//System.out.println("학생의 이름은 "+student1.studentName+"이고 주소는 "+student1.address+"입니다");
		
		
		
		//생성자를 이용하여 초기화(이름, 주소/student2)
		
		Student student2 = new Student("꼬맹이","부천");
		student2.showstudentInfo();
//		System.out.print("학생의 이름은 "+student2.studentName+"이고 ");
//		System.out.print(student2.address+"에 살고 있습니다");
		
		
		//get/set 메소드
		Student student3 = new Student();
		student3.setStudentName("솔데스크");
		student3.setAddress("종로구");
		student3.showstudentInfo();
		
		
	}

}
