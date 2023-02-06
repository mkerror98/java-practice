package ch6_oop1;

class Tv {
	// Tv의 속성(멤버변수) 	
	String color;			// 색상.
	boolean power;			// 전원상태.
	int channel;			// 채널.
	
	//Tv의 기능(메서드)
	void power()	 	{power = !power;}		// Tv의 전원을 끄거냐 켜는 메서드.
	void channelUp() 	{++channel;}			// Tv의 채널을 높이는 메서드.
	void channelDown()	{--channel;}			// Tv의 채널을 낮추는 메서드.
}

public class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}

}
