package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		
		//������� Ȱ���Ͽ� �ʱ�ȭ(�̸�, �ּ�)
		Student student1 = new Student();
		
		student1.studentName="�岿��";
		student1.address="��õ";
		
		student1.showstudentInfo();
		
		//System.out.println("�л��� �̸��� "+student1.studentName+"�̰� �ּҴ� "+student1.address+"�Դϴ�");
		
		
		
		//�����ڸ� �̿��Ͽ� �ʱ�ȭ(�̸�, �ּ�/student2)
		
		Student student2 = new Student("������","��õ");
		student2.showstudentInfo();
//		System.out.print("�л��� �̸��� "+student2.studentName+"�̰� ");
//		System.out.print(student2.address+"�� ��� �ֽ��ϴ�");
		
		
		//get/set �޼ҵ�
		Student student3 = new Student();
		student3.setStudentName("�ֵ���ũ");
		student3.setAddress("���α�");
		student3.showstudentInfo();
		
		
	}

}
