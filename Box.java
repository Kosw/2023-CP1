/*
 * 컴프터프로그래밍1
 * 학번: 202301741
 * 이름: 고선우
*/
package Project03;

import java.util.Scanner;//스캐너 사용하기 위해 가져온다

public class Box {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//불러온 스캐너에 in이라는 이름을 지정해준다.
		System.out.print("사각형의 가로를 입력하시오: ");//출력
		double w = in.nextDouble();//double형 변수를 만들고 입혁받는다.
		System.out.print("사각형의 세로를 입력하시오: ");//출력
		double h = in.nextDouble();//double형 변수를 만들고 입혁받는다.
		double area = w * h;//double형 변수를 만들고 입력받은 w랑 h를 곱한 값을 넣어준다.
		double perimeter = (w + h) * 2;//double형 변수를 만들고 w랑 h를 더한 후 2를 곱한 값을 넣어준다.
		System.out.print("사각형의 넓이는 ");//풀력
		System.out.println(area);//area를 출력
		System.out.print("사각형의 둘레는 ");//출력
		System.out.println(perimeter);//perimeter를 출력

		in.close();
		}
}
