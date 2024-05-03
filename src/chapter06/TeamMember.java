package chapter06;

public class TeamMember {

	//멤버변수 = 필드
	public String teamName; //팀명
	public String mName; //팀장
	public String mPhone; //팀장 전화번호
	public String sName; //부팀장
	public String name; //팀원
	public String gender; //팀원 성별
	
	//기본 생성자
	public TeamMember() {
		
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	//오버로딩 생성자(String name, String gender)
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
