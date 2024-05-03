package chapter03.fortest;

public class ForTest10 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print("["+i+"단"+"]"+"\t");
		}
		
		System.out.println();
		
		//i를 다시 선언하면 쓸 수 있다 !
		//이중for문은 안의 for문이 끝나야 밖의 for문을 적용할 수 있음
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t"); //\t는 탭
			}
			System.out.println();
		}

	}

}
