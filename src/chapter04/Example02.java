package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for 문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하세요
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}}; //3행 x열

		/* 행 고정 2차원 배열
		 * 95 86 > 0행
		 * 83 92 96 > 1행
		 * 78 83 93 87 88 >2행
		 */
		
		double avg=0;
		int total=0;
		int alltotal=0;
		int count=0;
		//행 array.length > 3
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {//0행 > 0열, 1열
			total += array[i][j]; //array[0][0] array[0][1]
			count++;//전체 평균을 구할 때 사용될 카운트
			}
			
			alltotal += total; //전체 평균에 사용될 합
			avg=(double)total/array[i].length;
			System.out.println((i+1)+"번째 행의 평균 값 : "+avg+"입니다.");
			total=0;//다음 행의 계산을 위해 쓰레기값 버림 안그러면 값이 계속 누적 되거든 !		
		}//for
		avg=(double)alltotal/count;
		System.out.println("배열 전체의 평균 값 : "+avg);
	}

}
