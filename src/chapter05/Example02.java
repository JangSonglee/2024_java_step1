package chapter05;

public class Example02 {
	// 최대값 메소드로 구현
	
	public static int findMax(int[] arr) {
		
		int max = arr[0]; //배열의 첫 번째 요소 0이라 하면 0번방 뿐만 아니라 행 전체 불러오기
		/*for(int i=0;i<arr.length;i++) {
			if(max<arr[i]){
				max=arr[i];
			}//if
		}//for*/
		
		//향상 for문
		for(int num: arr) {
			if(num>max){
				max=num;
			}//if
		}//for
		return max;
	}

	public static void main(String[] args) {
		int[] numbers= {7,2,9,1,5};
		int maxnum = findMax(numbers);
		System.out.println("최대값 : "+maxnum);

	}

}
