package chapter03.switchtest;

public class SwitchCase06 {

	public static void main(String[] args) {

		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재 시간 : "+time+"시]");
		System.out.print("할 일 : ");
		
		switch (time) {
		case 9: {
			System.out.print("공부");
			break;
		}
		case 13: {
			System.out.print("점심");
			break;
		}
		case 17: {
			System.out.print("취미");
			break;
		}
		case 18: {
			System.out.print("운동");
			break;
		}
		default:
			System.out.print("노는게 제일 좋아");;
		}

	}

}
