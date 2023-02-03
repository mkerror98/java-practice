package ch5_array;

public class ArrayEx19 {

	public static void main(String[] args) {
		int[][] score = {
							{100, 100, 100}
						   ,{80, 80, 80}
						   ,{30, 30, 30}
						   ,{50, 50, 50}
						   ,{20, 20, 20}
						};
		// 과목별 총점.
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균.");
		System.out.println("=============================");
		
		for(int i=0; i<score.length; i++) {
			int sum  = 0 ;			// 개인별 총점.
			float average = 0.0f;	// 개인별 평균.
			
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[j].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			average = sum/(float)score[i].length;   // 평균계산.
			System.out.printf("%5d %5.1f\n", sum, average);
		}
		
		System.out.println("==============================");
		System.out.printf("총점: %3d %4d %4d\n", korTotal, engTotal, mathTotal);
	}

}
