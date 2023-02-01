package ch5_array;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// for문을 통해 배열 arr에 1,2,3,4,5를 저장.
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("변경 전.");
		System.out.println("arr.length : " + arr.length);
		
		// for문을통해 배열 arr 출력.
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
		
		System.out.println("변경 후.");
		System.out.println("arr.length : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

}
