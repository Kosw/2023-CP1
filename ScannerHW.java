/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project02;

import java.util.Scanner;//스캐너 사용하기 위해 가져오는거 

public class ScannerHW {//클래스 시작
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//Scanner를 사용하기 위해 in이라는 이름을 지어줌.
		System.out.println("Enter String, integer_number1, integer_number2, real_number3>> ");
		//Enter String, integer_number1, integer_number2, real_number3>>을 출력한다.
		String str1 = in.next();//문자열을 입력받는다.
		int num1 = in.nextInt();//정수값을 입력받는다.
		int num2 = in.nextInt();//정수값을 입력받는다.
		float num3 = in.nextFloat();//실수을 입력받는다.
		
		System.out.printf("Hello, this is %s.\n", str1);//Hello, this is를 출력하고 str1에 받았던 문자열을 출력한다.
		System.out.printf("This is %d years old.\n", num1);//This is years old.랑 입력받았던 정수값을 출력한다.
		System.out.printf("Integer: %d, Real number: %f", num2, num3);
		//Integer: , Real number: 랑 입력받았던 정수값이랑 실수값을 출력한다.
		in.close();
	}
}
