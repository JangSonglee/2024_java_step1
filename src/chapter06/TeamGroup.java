package chapter06;

public class TeamGroup {

	//멤버변수 : 외부에서 참조를 하기 때문에 멤버 변수
	private TeamMember[] member = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0]=new TeamMember("장송이","여");
		member[1]=new TeamMember("김연수","여");
		member[2]=new TeamMember("나승찬","남");
		member[3]=new TeamMember("최선빈","남");
		member[4]=new TeamMember("이현민","남");
		member[5]=new TeamMember("이동준","남");
	}
	
	//출력 메소드
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.print("성명 : "+(member[i].getName()));
			System.out.println(", 성별 : "+(member[i].getGender()));
		}
	}
	
}
