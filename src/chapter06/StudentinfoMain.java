package chapter06;

public class StudentinfoMain {

	public static void main(String[] args) {
		
		//��ü : ������ ����� ���� ��������� public�� �����ϴ� ��
		// #1. ������� ���� �ʱ�ȭ : studentKim
		Studentinfo studentKim = new Studentinfo();
		System.out.println(studentKim.address);
		
		//�ʱ�ȭ : ���� ������� �ҷ����� �ϳ��ϳ� �� �ʱ�ȭ�ؼ� ����Ʈ����� �Ѵ� !
		studentKim.studentID = 100;
		studentKim.grade = 3;
		studentKim.address = "��õ";
		System.out.println(studentKim.address);
		
		//��ü�� �پ缺(?)
		//#2. �����ڸ� ���� �ʱ�ȭ : studentLee
		Studentinfo studentLee = new Studentinfo(1004, "����", 12, "��õ");
		System.out.println(studentLee.address);
		
		//#3. getter & setter �ʱ�ȭ : studentPark
		Studentinfo studentPark = new Studentinfo();
		System.out.println(studentPark.address);
		studentPark.setStudentName("����");
		System.out.println(studentPark.getStudentName());
		

	}

}
