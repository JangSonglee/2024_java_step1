package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		//TeamGroupÀÇ °´Ã¼(team)
		TeamGroup team = new TeamGroup();
		
		team.init();
		team.Disp();
		
		System.out.println();
		
		TeamMember t = new TeamMember();
		t.setmName("ÀÌÇö¹Î");
		System.out.println("ÆÀÀå ÀÌ¸§ : "+t.getmName());
		t.setmPhone("010-1234-5678");
		System.out.println("ÆÀÀå ÀüÈ­¹øÈ£ : "+t.getmPhone());
		t.setsName("³ª½ÂÂù");
		System.out.println("ºÎÆÀÀå ÀÌ¸§ : "+t.getsName());

	}

}
