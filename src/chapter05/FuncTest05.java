package chapter05;

public class FuncTest05 {
	
	//멤버 변수 = 필드
	public String channel;
	public int channelInt;
	public int volume;

	public int channelUp(int volume) {
		System.out.println("소리를 높이겠습니다.");
		return volume+2;//int 이기 때문에 값을 전해줘야 한다!
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를"+volume+"만큼 내립니다.");
		
	}
	
	public static void main(String[] args) {
		
		FuncTest05 tv=new FuncTest05(); //스텍이 없기 때문에 변수값을 선언해줘야 한다!

		System.out.println("소리를"+tv.channelUp(5)+"만큼 올립니다.");
		System.out.println("---------------------------------");
		int volume=tv.channelUp(9);//변수 방에 대입하면 활용하기 좋으니까 !
		System.out.println("소리를"+volume+"만큼 올립니다.");
		System.out.println();
		tv.channelDown(5);

	}

}
