package chapter05;

public class FuncTest05 {
	
	//��� ���� = �ʵ�
	public String channel;
	public int channelInt;
	public int volume;

	public int channelUp(int volume) {
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
		return volume+2;//int �̱� ������ ���� ������� �Ѵ�!
	}
	
	public void channelDown(int volume) {
		System.out.println("�Ҹ���"+volume+"��ŭ �����ϴ�.");
		
	}
	
	public static void main(String[] args) {
		
		FuncTest05 tv=new FuncTest05(); //������ ���� ������ �������� ��������� �Ѵ�!

		System.out.println("�Ҹ���"+tv.channelUp(5)+"��ŭ �ø��ϴ�.");
		System.out.println("---------------------------------");
		int volume=tv.channelUp(9);//���� �濡 �����ϸ� Ȱ���ϱ� �����ϱ� !
		System.out.println("�Ҹ���"+volume+"��ŭ �ø��ϴ�.");
		System.out.println();
		tv.channelDown(5);

	}

}
