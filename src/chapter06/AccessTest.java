package chapter06;

public class AccessTest {

	//������� = �ʵ�
	private int aa; //���� Ŭ���������� ���
	public int bb; //���� ������ ����(�ٸ� Ŭ������ ��Ű������ ��밡��)
	int cc; //public ����
	
	//����Ʈ ������ ���� ���� (�����ε��� ���� �ʾұ� ������)
	
	//�޼���
	public void SetAa(int aa) { 
		this.aa=aa; //�ʱ�ȭ
		
	}
	
	public void SetBb(int bb) { 
		this.bb=bb; //�ʱ�ȭ
		
	}
	
	public void SetCc(int cc) { 
		this.cc=cc; //�ʱ�ȭ
		
	}
	
	public void Disp() {
		System.out.println("aa��:"+aa+"\nbb��:"+bb+"\ncc��:"+cc);
	}
	
	
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		//aa�ʱ�ȭ ���
		obj.aa=20;
		//obj.SetAa(20);
		
		obj.SetBb(30);
		
		obj.SetCc(40);
		
		obj.Disp();
		
		
	}

}
