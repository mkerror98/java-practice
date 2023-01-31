package ch5_array;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[5];   // 길이가 5인 배열을 생성.
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;     // score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];  // int tmp = score[3] + score[4];
		
		// for문으로도 작성해보기.
		//for(int i=0; i<5; i++) {
		//	score[i] = i*10 + 50;
		//}
		
		// for문으로 배열의 모든 요소를 출력해보자.
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
		System.out.printf("tmp = %d", tmp); 
	}

}
