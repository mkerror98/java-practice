package ch3_operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		i=5;		// 결과 비교를 위해 i와 j의 값을 5와 0으로 다시 변
		j=0;
		
		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
	}

}
