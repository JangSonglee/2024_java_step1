package chapter05;

public class FuncTest06 {
	
	//멤버 변수=필드 (this로 대입연산)
	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략(디폴트 생성자이기 때문에 자동 생성)
	
	//메소드
	public int channelUp(int volume) {
		this.volume=volume;//디스를 사용하지 않으면 앞의 볼륨에 5가 대입이 돼서 볼륨=5라는 말이 성립되지 않음 !
		System.out.println("소리를 높이겠습니다.");
		return volume+2; //void가 없으니까 리턴 해줘야 함
	}
	
	public void channelDown(int volume) { //void 사용법
		this.volume=volume;//디스를 사용하지 않으면 앞의 볼륨에 5가 대입이 돼서 볼륨=5라는 말이 성립되지 않음 !
		System.out.println("소리를 낮추겠습니다.");
		System.out.println("소리를 "+volume+"만큼 내립니다.");
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		
		FuncTest06 tv=new FuncTest06();//int만 선언했기 때문에 인스턴스변수를 적어줘야 한다!
		int a=5;
		int b=9;
		//tv.channelUp(5);
		
		System.out.println("소리를 "+tv.channelUp(a)+"만큼 올립니다.");
		System.out.println("===========================");
		
		int volume=tv.channelUp(b);
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		
		System.out.println("===========================");
		
		
		//void 메소드 호출
		tv.channelDown(b);

	}

}
