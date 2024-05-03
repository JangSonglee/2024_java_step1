package chapter04;

public class EnhancedForLoop03 {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,50};
		int sum=0;
		
		for(int num:numbers) {
			System.out.println(num);
			sum+=num;
		}
		System.out.println("гу╟Х : "+sum);


	} 

}
