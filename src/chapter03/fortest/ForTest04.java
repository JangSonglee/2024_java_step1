package chapter03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("==0���� 100������ �� �� Ȧ���� ���� ���==");
		
		int num;
		int total=0;
		
		for(num=0;num<=100;num++) {
			
			if(num%2==0) {
				continue; //¦���� �׳� ������ ^^ (����)
			}
			System.out.print(num+" ");
			total+=num;
			
		}
		System.out.println();
		System.out.print("1���� 100������ �� �� Ȧ���� �� : "+total);
		
		
		System.out.println();
		System.out.println("==1���� 20������ �� �� Ȧ���� ���==");
		// �ٸ� ���
		int num2;
		int total2=0;
		
		for(num2=0;num2<=20;num2++) {
			
			if(num2%2==1) {
				System.out.print(num2+" ");
				total+=num2;
				//System.out.print("1���� 20������ �� �� Ȧ���� ��� : "+num2);
				
			}
			
		}
		
		
	}

}
