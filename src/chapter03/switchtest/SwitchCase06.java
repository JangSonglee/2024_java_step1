package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {

		int time=(int)(Math.random()*10)+9;
		System.out.println("[���� �ð� : "+time+"��]");
		System.out.print("�� �� : ");
		
		switch (time) {
		case 9: {
			System.out.print("����");
			break;
		}
		case 13: {
			System.out.print("����");
			break;
		}
		case 17: {
			System.out.print("���");
			break;
		}
		case 18: {
			System.out.print("�");
			break;
		}
		default:
			System.out.print("��°� ���� ����");;
		}

	}

}
