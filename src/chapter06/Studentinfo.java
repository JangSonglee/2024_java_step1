package chapter06;

public class Studentinfo {
	
	//멤버변수=필드
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	//생성자
	public Studentinfo() {
		
	}

	public Studentinfo(int studentID, String studentName, int grade, String address) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	//메소드
	//오른 클릭
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
