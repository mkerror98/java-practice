package ch5_array;

public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {
							{100, 100, 100}
						   ,{30, 30, 30}
						   ,{50, 50, 50}
						   ,{80, 80, 80}
		};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j	++) {
				System.out.printf("score[%d][%d] : %d\n", i, j, score[i][j]);
			}
		}
		
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum :" + sum);
	}

}
