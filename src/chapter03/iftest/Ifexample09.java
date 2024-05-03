package chapter03.iftest;

import javax.swing.JOptionPane;

public class Ifexample09 {

	public static void main(String[] args) {
		// 데이터셋
		String ID="soldesk";
		int PW=240119;
		
		// 고객
		String id=JOptionPane.showInputDialog("아이디");
		int pass=Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));//JOptionPane 자체가 스트링이기 때문에 강제로 변환
		
		if(ID.equals(id)) { //equals은 두 개의 숫자가 스트링이여야 비교 가능
			//비밀번호를 검색
			if(PW==pass) {
				System.out.println(ID+"님 환영합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("일치하는 아이디가 없습니다.");
		}
		
	}

}
