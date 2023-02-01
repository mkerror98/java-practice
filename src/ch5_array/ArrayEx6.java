package ch5_array;

public class ArrayEx6 {

	public static void main(String[] args) {
		int[] score = { 79, 24, 62, 88, 48, 98, 100 };
		
		int max = score[0];		// 배열의 첫번째 값으로 최대값을 초기화.
		int min = score[0];		// 배열의 첫번째 값으로 최소값을 초기화.
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
