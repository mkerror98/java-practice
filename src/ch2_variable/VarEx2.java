// 두 변수 x와 y의 값을 교환하기.
package ch2_variable;

public class VarEx2 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
