package ch5_array;
import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];   // 배열의 길이가 10인 int배열 생성.
		int[] iArr2 = new int[10];	 // 배열의 길이가 10인 int배열 생성.
		int[] iArr3 = {100, 90, 80, 70};
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		
		// iArr1에 숫자 1~10까지를 배열에 순서대로 넣어보자.
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		// iArr2에 1~10 사이의 랜덤한 값을 저장해보자.
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10 + 1);
		}
		
		// 배열의 값들을 출력해보자.
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(chArr);		// char배열은 그냥 출력 가능.
		System.out.println(iArr1);
	}
}
