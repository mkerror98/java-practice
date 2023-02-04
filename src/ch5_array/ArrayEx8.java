package ch5_array;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		// 배열의 각 요소에 1~45의 값을 저장.
		for(int i=0; i<45; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;	// 두 값을 바꾸기 위해 사용될 임시변수.
		int j = 0 ;		// 임의의 값을 얻어서 저장할 변수.
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꾼다.
		// 0번째부터 5번째 요소까지 총 6번만 바꾼다.
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			temp	= ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// 배열 ball의 앞에서부터 6개의 요소를 출력.
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d] = %d\n", i, ball[i]);
		}
		
		
		
	}

}