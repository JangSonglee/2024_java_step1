package chapter06;

public class Student {

	//멤버변수=필드
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	//생성자 오버로딩
	public Student() {
		
	}

	
	//메서드
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void showstudentInfo() {
		System.out.println(studentName+", "+address);
	}

	
	
	
	
	
}
