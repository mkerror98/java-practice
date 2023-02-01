package ch5_array;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.print(Arrays.toString(numArr));
		System.out.println();
		
		for(int i=0; i < 100; i++) {
			int n = (int)(Math.random() * 10);  // 0~9중의 하나를 임의로 얻음.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}		
		System.out.print(Arrays.toString(numArr));

	}

}
