package chapter06;

public class Student {

	//�������=�ʵ�
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	//������ �����ε�
	public Student() {
		
	}

	
	//�޼���
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
