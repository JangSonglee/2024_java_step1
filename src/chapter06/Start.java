package chapter06;

import java.util.Random;

public class Start {

	private int pcnum=new Random().nextInt(50)+1; //1~50 ���� ����
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//���������� ������ up, ũ�� down, ��ġ�ϸ� result="SUCCESS"
		if(pcnum>mynumber) {
			System.out.println("�� ���� ���ڸ� �����ּ���");
		}else if(pcnum<mynumber) {
			System.out.println("�� ���� ���ڸ� �����ּ���");
		}else if(pcnum==mynumber){
			System.out.println(count+"ȸ ���� ����!");
			result="SUCCESS";
		}
		return result;
	}
	
	
}
