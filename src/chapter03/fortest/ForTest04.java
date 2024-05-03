package chapter03.fortest;

public class ForTest04 {

	public static void main(String[] args) {
		System.out.println("==0부터 100까지의 수 중 홀수의 합을 출력==");
		
		int num;
		int total=0;
		
		for(num=0;num<=100;num++) {
			
			if(num%2==0) {
				continue; //짝수는 그냥 가세요 ^^ (무시)
			}
			System.out.print(num+" ");
			total+=num;
			
		}
		System.out.println();
		System.out.print("1부터 100까지의 수 중 홀수의 합 : "+total);
		
		
		System.out.println();
		System.out.println("==1부터 20까지의 수 중 홀수룰 출력==");
		// 다른 방법
		int num2;
		int total2=0;
		
		for(num2=0;num2<=20;num2++) {
			
			if(num2%2==1) {
				System.out.print(num2+" ");
				total+=num2;
				//System.out.print("1부터 20까지의 수 중 홀수만 출력 : "+num2);
				
			}
			
		}
		
		
	}

}
