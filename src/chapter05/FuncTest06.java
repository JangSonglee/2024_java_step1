package chapter05;

public class FuncTest06 {
	
	//��� ����=�ʵ� (this�� ���Կ���)
	public String channel;
	public int channelInt;
	public int volume;
	
	//������ ����(����Ʈ �������̱� ������ �ڵ� ����)
	
	//�޼ҵ�
	public int channelUp(int volume) {
		this.volume=volume;//�𽺸� ������� ������ ���� ������ 5�� ������ �ż� ����=5��� ���� �������� ���� !
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
		return volume+2; //void�� �����ϱ� ���� ����� ��
	}
	
	public void channelDown(int volume) { //void ����
		this.volume=volume;//�𽺸� ������� ������ ���� ������ 5�� ������ �ż� ����=5��� ���� �������� ���� !
		System.out.println("�Ҹ��� ���߰ڽ��ϴ�.");
		System.out.println("�Ҹ��� "+volume+"��ŭ �����ϴ�.");
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		
		FuncTest06 tv=new FuncTest06();//int�� �����߱� ������ �ν��Ͻ������� ������� �Ѵ�!
		int a=5;
		int b=9;
		//tv.channelUp(5);
		
		System.out.println("�Ҹ��� "+tv.channelUp(a)+"��ŭ �ø��ϴ�.");
		System.out.println("===========================");
		
		int volume=tv.channelUp(b);
		System.out.println("�Ҹ��� "+volume+"��ŭ �ø��ϴ�.");
		
		System.out.println("===========================");
		
		
		//void �޼ҵ� ȣ��
		tv.channelDown(b);

	}

}
