package ch5_array;

public class ArrayEx12 {

	public static void main(String[] args) {
		String[] names = {"KIM", "PARK", "YI"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names [" + i + "]:" + names[i]);
		}
		
		String tmp = names[2];		// tmp에 "YI"를 저장.
		System.out.println("tmp:" + tmp);
		names[0] = "Yu";		// 배열 names의 첫 요소를 "Yu"로 변경.
		
		for(String str : names)		// 향상된 for문.
			System.out.println(str);
	}

}
