// 두 개의 변수 age와 year를 선언한 다음, 값을 저장하고 출력해보자.
package ch2_variable;

public class VarEx1 {

	public static void main(String[] args) {
		int age = 26;		// 변수 age를 26으로 초기화.
		int year = 0;		// 변수 year를 0으로 초기화.
		
		System.out.println(age);
		System.out.println(year);
		
		year = 2000 + age;	// age에 2000을 더한 것을 year에 저장.
		age = age + 1;		// 변수 age에 1을 더함.
		
		System.out.println(year);
		System.out.println(age);
		
	}

}
