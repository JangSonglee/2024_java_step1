package chapter06;

public class TeamMember {

	//������� = �ʵ�
	public String teamName; //����
	public String mName; //����
	public String mPhone; //���� ��ȭ��ȣ
	public String sName; //������
	public String name; //����
	public String gender; //���� ����
	
	//�⺻ ������
	public TeamMember() {
		
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	//�����ε� ������(String name, String gender)
	public TeamMember(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	//getters & setters
	
	public String getName() {
		return name;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
}
