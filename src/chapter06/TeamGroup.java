package chapter06;

public class TeamGroup {

	//������� : �ܺο��� ������ �ϱ� ������ ��� ����
	private TeamMember[] member = new TeamMember[6];
	
	//�⺻ ������
	
	//�ʱ�ȭ �޼ҵ�
	public void init() {
		member[0]=new TeamMember("�����","��");
		member[1]=new TeamMember("�迬��","��");
		member[2]=new TeamMember("������","��");
		member[3]=new TeamMember("�ּ���","��");
		member[4]=new TeamMember("������","��");
		member[5]=new TeamMember("�̵���","��");
	}
	
	//��� �޼ҵ�
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.print("���� : "+(member[i].getName()));
			System.out.println(", ���� : "+(member[i].getGender()));
		}
	}
	
}
