package chapter06;

public class Studentinfo {
	
	//�������=�ʵ�
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	//������
	public Studentinfo() {
		
	}

	public Studentinfo(int studentID, String studentName, int grade, String address) {
		
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}

	//�޼ҵ�
	//���� Ŭ��
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
