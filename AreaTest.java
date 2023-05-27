/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project03;

import java.util.Scanner;//스캐너를 불러온다.

public class AreaTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// 불러온 스캐너에 in이라는 이름을 지정해준다.

		System.out.print("반지름을 입력하시오 >> ");// 출력

		double radius = in.nextInt();// double타입으로 뱐수를 만들고 입력받는다.
		final double pi = 3.141592;// 상수로 지정해주고 파이값을 넣어준다.
		double area = radius * radius * pi;// 원의 넓이를 구하고 area변수에 지정해준다.

		System.out.printf("반지름이 %f", radius);// 반지름 출력
		System.out.print("인 원의 면적은 ");// 출력
		System.out.print(area);// 넓이 출력
		in.close();
	}
}
